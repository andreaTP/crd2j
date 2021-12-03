package org.crdfromjava;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.Modifier;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.expr.Name;
import com.github.javaparser.ast.expr.SingleMemberAnnotationExpr;
import com.github.javaparser.ast.expr.StringLiteralExpr;
import com.github.javaparser.ast.type.ClassOrInterfaceType;
import com.github.javaparser.printer.DefaultPrettyPrinter;
import io.fabric8.kubernetes.api.model.IntOrString;
import io.fabric8.kubernetes.api.model.apiextensions.v1.JSONSchemaProps;
import io.fabric8.kubernetes.client.DefaultKubernetesClient;
import io.fabric8.kubernetes.client.KubernetesClient;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        System.out.println("Start");

//        var source = new FileInputStream(args[0]);
        var source = new File("./keycloak_crd.yaml");
        var dest = new File("./src/main/java");

        try (final KubernetesClient client = new DefaultKubernetesClient()) {

            // Read CRD as a plain text file
            var content = new String(Files.readAllBytes(source.toPath()));

            // Parse CRD as plain YAML
            var yamlMapper = new ObjectMapper(new YAMLFactory());
            var yaml = yamlMapper.readTree(source);

            // Parse CRD in fabric8
            var crd = client
                    .apiextensions()
                    .v1()
                    .customResourceDefinitions()
                    .load(source)
                    .get();

            var cu = new CompilationUnit();

            var pkg = getPackage(content);
            pkg.ifPresent((p) -> cu.setPackageDeclaration(p));

            var crName = crd.getSpec().getNames().getKind();
            var crSpecName = crName + "Spec";
            var crStatusName = crName + "Status";

            var spec = crd.getSpec();
            // TODO: handling only the first version for now
            var specVersion = spec.getVersions().get(0);
            var version = specVersion.getName();
            var group = spec.getGroup();

            var cr = cu.addClass(crName);
            generateCR(cr, version, group, crSpecName, crStatusName);

            var additionalClasses = new ArrayList<String>();

            var crSpec = cu.addClass(crSpecName);
            var specProps = specVersion
                    .getSchema()
                    .getOpenAPIV3Schema()
                    .getProperties()
                    .get("spec")
                    .getProperties();

            additionalClasses.addAll(
                generatePojo(cu, crSpec, specProps)
            );

            var crStatus = cu.addClass(crStatusName);
            var statusProps = specVersion
                    .getSchema()
                    .getOpenAPIV3Schema()
                    .getProperties()
                    .get("status")
                    .getProperties();

            additionalClasses.addAll(
                generatePojo(cu, crStatus, statusProps)
            );

            var destinationFolder = createFolders(pkg, dest);
            System.out.println(destinationFolder.getAbsolutePath());

            cu.printer(new DefaultPrettyPrinter());
            writeJavaClass(cu, destinationFolder, crName);
            writeJavaClass(cu, destinationFolder, crSpecName);
            writeJavaClass(cu, destinationFolder, crStatusName);

            for (var cn: additionalClasses) {
                writeJavaClass(cu, destinationFolder, cn);
            }

//            System.out.println(
//                    cu.toString()
//            );
        }

        System.out.println("End");
    }

    private static File createFolders(Optional<String> pkg, File folder) {
        var destFolder = folder.toPath();
        if (pkg.isPresent()) {
            for (var p: pkg.get().split("\\.")) {
                System.out.println(p);
                destFolder = destFolder.resolve(p);
            }
        }
        destFolder.toFile().mkdirs();
        return destFolder.toFile();
    }

    private static void writeJavaClass(CompilationUnit cu, File file, String name) throws IOException {
        var clazz = cu.getClassByName(name);
        assert(clazz.isPresent());

        var content = new StringBuilder();
        cu.getPackageDeclaration().ifPresent((p) -> content.append(p));
        content.append(clazz.get().toString());

        writeToFile(
                file.toPath().resolve(name + ".java").toFile(),
                content.toString());
    }

    private static void writeToFile(File file, String str) throws IOException {
        var fileWriter = new FileWriter(file);
        var printWriter = new PrintWriter(fileWriter);
        try {
            printWriter.println(str);
        } finally {
            printWriter.flush();
            printWriter.close();
        }
    }

    private static Optional<String> getPackage(String content) {
        var optJavaPkg = Arrays.stream(content.split("\n"))
                .filter((s) -> s.startsWith("#"))
                .filter((s) -> s.contains("java-package:"))
                .findFirst();

        return optJavaPkg.map((s) -> s
                    .replace("#", "")
                    .replace("java-package:", "")
                    .trim());
    }


    private static void generateCR(ClassOrInterfaceDeclaration cr, String version, String group, String crSpec, String crStatus) {
        cr.addAnnotation(
                new SingleMemberAnnotationExpr(
                        new Name("io.fabric8.kubernetes.model.annotation.Version"),
                        new StringLiteralExpr(version)));
        cr.addAnnotation(
                new SingleMemberAnnotationExpr(
                        new Name("io.fabric8.kubernetes.model.annotation.Group"),
                        new StringLiteralExpr(group)));

        new ClassOrInterfaceType()
                .setName("io.fabric8.kubernetes.client.CustomResource")
                .setTypeArguments(new ClassOrInterfaceType().setName(crSpec), new ClassOrInterfaceType().setName(crStatus));

        cr.addExtendedType(new ClassOrInterfaceType()
                .setName("io.fabric8.kubernetes.client.CustomResource")
                .setTypeArguments(new ClassOrInterfaceType().setName(crSpec), new ClassOrInterfaceType().setName(crStatus)));
        cr.addImplementedType("io.fabric8.kubernetes.api.model.Namespaced");
    }

    private static List<String> generatePojo(CompilationUnit cu, ClassOrInterfaceDeclaration decl, Map<String, JSONSchemaProps> props) {
        var additionalClasses = new ArrayList<String>();
        for (var key: props.keySet()) {
            var value = props.get(key);
            var typ = value.getType();
            // TODO: refactor me
            // Kubernetes primitive types handling is hammered
            if (typ == null) {
                if (value.getXKubernetesIntOrString()) {
                    typ = "io.fabric8.kubernetes.api.model.IntOrString";
                } else {
                    throw new RuntimeException("Kubernetes native type not handled " + key);
                }
            }

            switch (typ) {
                case "object":
                    var objType = getType(key);
                    if (value.getAdditionalProperties() != null) {
                        if (value.getAdditionalProperties().getSchema().getXKubernetesIntOrString() != null && value.getAdditionalProperties().getSchema().getXKubernetesIntOrString()) {
                            objType = "io.fabric8.kubernetes.api.model.IntOrString";
                        } else if (value.getAdditionalProperties().getSchema().getType() != null) {

                            // TODO: fixme! Big hammer since the day is ending ... this should work on the normal recursion scheme
                            if (value.getAdditionalProperties().getSchema().getType().equals("array")) {
                                objType = new ClassOrInterfaceType()
                                        .setName("java.util.List")
                                        .setTypeArguments(new ClassOrInterfaceType().setName(
                                                getType(value.getAdditionalProperties().getSchema().getItems().getSchema().getType()))).toString();
                            } else {
                                objType = getType(value.getAdditionalProperties().getSchema().getType());
                            }

                        } else {
                            throw new RuntimeException("Object prop not handled " + key);
                        }
                    } else if (value.getProperties() != null) {
                        var objClass = cu.addClass(objType);
                        additionalClasses.add(objType);
                        additionalClasses.addAll(
                                generatePojo(cu, objClass, value.getProperties())
                        );
                    } else {
                        throw new RuntimeException("Object not handled " + key);
                    }

                    var objField = decl.addField(objType, key, Modifier.Keyword.PRIVATE);
                    objField.createGetter();
                    objField.createSetter();

                    break;
                case "array":
                    var arrType = getType(value.getItems().getSchema().getType());
                    if (!isPrimitive(value.getItems().getSchema().getType())) {
                        arrType = getType(key);
                        var objClass = cu.addClass(arrType);
                        additionalClasses.add(arrType);
                        additionalClasses.addAll(
                                generatePojo(cu, objClass, value.getItems().getSchema().getProperties())
                        );
                    }
                    // TODO: better to use Arrays?
                    var type = new ClassOrInterfaceType()
                            .setName("java.util.List")
                            .setTypeArguments(new ClassOrInterfaceType().setName(arrType));
                    var arrField = decl.addField(type, key, Modifier.Keyword.PRIVATE);
                    arrField.createGetter();
                    arrField.createSetter();

                    break;
                default:
                    var field = decl.addField(getType(typ), key, Modifier.Keyword.PRIVATE);
                    field.createGetter();
                    field.createSetter();
                    break;
            }
        }

        return additionalClasses;
    }

    private static String getType(String type) {
        switch (type) {
            case "boolean":
                return "boolean";
            case "integer":
                return "int";
            case "string":
                return "String";
            default:
                if (type.contains(".")) return type;
                else return type.substring(0, 1).toUpperCase() + type.substring(1);
        }
    }

    private static boolean isPrimitive(String type) {
        switch (type) {
            case "boolean":
            case "integer":
            case "string":
                return true;
            default:
                return false;
        }
    }

}
