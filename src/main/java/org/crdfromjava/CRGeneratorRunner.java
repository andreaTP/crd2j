package org.crdfromjava;

import com.github.javaparser.ast.CompilationUnit;
import io.fabric8.kubernetes.api.model.apiextensions.v1.CustomResourceDefinition;
import io.fabric8.kubernetes.client.DefaultKubernetesClient;
import io.fabric8.kubernetes.client.KubernetesClient;

import java.io.File;
import java.nio.file.Files;
import java.util.*;

public class CRGeneratorRunner {

    public void run(File source, File basePath) {
        try (final KubernetesClient client = new DefaultKubernetesClient()) {
            // Read CRD as a plain text file
            var content = "";
            try {
                content = new String(Files.readAllBytes(source.toPath()));
            } catch (Exception cause) {
                throw new RuntimeException(cause);
            }

            var pkg = getPackage(content);

            // Parse CRD with fabric8
            var crd = client
                    .apiextensions()
                    .v1()
                    .customResourceDefinitions()
                    .load(source)
                    .get();

            var writables = generate(crd, pkg);

            for (var w : writables) {
                w.writeAllJavaClasses(basePath);
            }
        }
    }

    private List<WritableCRCompilationUnit> generate(CustomResourceDefinition crd, Optional<String> basePackageName) {
        var crSpec = crd.getSpec();
        var crName = crd.getSpec().getNames().getKind();
        var group = crd.getSpec().getGroup();

        var writableCUs = new ArrayList<WritableCRCompilationUnit>(crSpec.getVersions().size());
        for (var crdv: crSpec.getVersions()) {
            var cu = new CompilationUnit();

            var version = crdv.getName();

            var pkg = basePackageName
                    .map((p) -> p + "." + version)
                    .orElse(version);

            cu.setPackageDeclaration(pkg);

            var crGenerator = new CRObjectGenerator(crName, version, group);

            var topLevelUUID = UUID.randomUUID().toString();
            var topLevelGenerator =
                    JSONSchemaToPojoGenerator.fromJsonSchema(topLevelUUID, crdv
                            .getSchema()
                            .getOpenAPIV3Schema());

            var classNames = new ArrayList<String>();
            classNames.addAll(crGenerator.generateJava(cu));
            classNames.addAll(topLevelGenerator.generateJava(cu));
            classNames.remove(topLevelUUID);

            writableCUs.add(
                    new WritableCRCompilationUnit(cu, classNames));
        }

        return writableCUs;
    }

    private Optional<String> getPackage(String content) {
        var optJavaPkg = Arrays.stream(content.split("\n"))
                .filter((s) -> s.startsWith("#"))
                .filter((s) -> s.contains("java-package:"))
                .findFirst();

        return optJavaPkg.map((s) -> s
                .replace("#", "")
                .replace("java-package:", "")
                .trim());
    }

}
