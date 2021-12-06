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
        // var source = new File("./crontab-crd.yml");
        var dest = new File("./src/main/java");
        //var dest = new File(".tmp");

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

            // TODO: check the output if starting one level up from Spec and Status?
            var crSpec = cu.addClass(crSpecName);
            var specProps = specVersion
                    .getSchema()
                    .getOpenAPIV3Schema()
                    .getProperties()
                    .get("spec")
                    .getProperties();

            var specClasses = new PojoObject(crSpecName, specProps)
                    .generateJava(cu);

            var statusProps = specVersion
                    .getSchema()
                    .getOpenAPIV3Schema()
                    .getProperties()
                    .get("status")
                    .getProperties();

            var statusClasses = new PojoObject(crStatusName, statusProps)
                    .generateJava(cu);

            var destinationFolder = createFolders(pkg, dest);
            System.out.println(destinationFolder.getAbsolutePath());

            cu.printer(new DefaultPrettyPrinter());
            writeJavaClass(cu, destinationFolder, crName);

            for (var cn: specClasses) {
                writeJavaClass(cu, destinationFolder, cn);
            }
            for (var cn: statusClasses) {
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

}
