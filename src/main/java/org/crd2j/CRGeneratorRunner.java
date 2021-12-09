package org.crd2j;

import com.github.javaparser.ast.CompilationUnit;
import io.fabric8.kubernetes.api.model.apiextensions.v1.CustomResourceDefinition;
import io.fabric8.kubernetes.client.DefaultKubernetesClient;
import io.fabric8.kubernetes.client.KubernetesClient;
import java.io.File;
import java.util.*;
import org.crd2j.ast.JCRObject;
import org.crd2j.ast.JSONSchema2Pojo;

public class CRGeneratorRunner {

    public void run(File source, File basePath) {
        try (final KubernetesClient client = new DefaultKubernetesClient()) {
            // Parse CRD with fabric8
            var crd = client.apiextensions().v1().customResourceDefinitions().load(source).get();

            var writables = generate(crd, getPackage(crd.getSpec().getGroup()));

            for (var w : writables) {
                w.writeAllJavaClasses(basePath);
            }
        }
    }

    public List<WritableCRCompilationUnit> generate(
            CustomResourceDefinition crd, Optional<String> basePackageName) {
        var crSpec = crd.getSpec();
        var crName = crd.getSpec().getNames().getKind();
        var group = crd.getSpec().getGroup();

        var writableCUs = new ArrayList<WritableCRCompilationUnit>(crSpec.getVersions().size());
        for (var crdv : crSpec.getVersions()) {
            var cu = new CompilationUnit();

            var version = crdv.getName();

            var pkg = basePackageName.map((p) -> p + "." + version).orElse(version);

            cu.setPackageDeclaration(pkg);

            var crGenerator = new JCRObject(crName, version, group);

            var topLevelUUID = "TopLevel" + UUID.randomUUID().toString().replace("-", "");
            var topLevelGenerator =
                    JSONSchema2Pojo.fromJsonSchema(
                            topLevelUUID, crdv.getSchema().getOpenAPIV3Schema());

            var classNames = new ArrayList<String>();
            classNames.addAll(crGenerator.generateJava(cu));
            classNames.addAll(topLevelGenerator.generateJava(cu));
            classNames.remove(topLevelUUID);

            writableCUs.add(new WritableCRCompilationUnit(cu, classNames));
        }

        return writableCUs;
    }

    private Optional<String> getPackage(String group) {
        if (group == null) {
            return Optional.empty();
        }

        var stack = new Stack<String>();
        for (var s : group.split("\\.")) {
            stack.push(s);
        }
        var packageName = new StringBuilder();
        packageName.append(stack.pop());
        for (var s : stack) {
            packageName.append(".");
            packageName.append(s.replace("-", "_"));
        }

        return Optional.of(packageName.toString());
    }
}
