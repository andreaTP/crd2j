package org.crd2j.ast;

import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.Modifier;
import com.github.javaparser.ast.NodeList;
import com.github.javaparser.ast.body.VariableDeclarator;
import com.github.javaparser.ast.expr.*;
import com.github.javaparser.ast.type.ClassOrInterfaceType;
import io.fabric8.kubernetes.api.model.apiextensions.v1.JSONSchemaProps;
import java.util.*;
import java.util.stream.Collectors;

public class JObject implements JSONSchema2Pojo {

    private String type = null;
    private Map<String, JSONSchema2Pojo> fields = new HashMap<>();
    private boolean preserveUnknownFields = false;

    private Set<String> ignoredFields = Set.of("description", "schema", "example", "examples");

    public JObject(
            String type,
            Map<String, JSONSchemaProps> fields,
            boolean preserveUnknownFields,
            String prefix,
            String suffix) {
        this.preserveUnknownFields = preserveUnknownFields;

        var nextPrefix = prefix;
        var nextSuffix = suffix;

        if (type.toLowerCase(Locale.ROOT).equals("spec")) {
            nextPrefix = "";
            nextSuffix = "Spec";
        }

        this.type =
                JSONSchema2Pojo.sanitizeString(
                        prefix + type.substring(0, 1).toUpperCase() + type.substring(1) + suffix);

        if (fields == null) {
            // no fields
        } else {
            for (var field : fields.entrySet()) {
                if (!ignoredFields.contains(field.getKey()))
                    this.fields.put(
                            field.getKey(),
                            JSONSchema2Pojo.fromJsonSchema(
                                    field.getKey(), field.getValue(), nextPrefix, nextSuffix));
            }
        }
    }

    @Override
    public String getType() {
        return this.type;
    }

    @Override
    public List<String> generateJava(CompilationUnit cu) {
        var clz = cu.getClassByName(this.type).orElse(null);

        if (clz == null) {
            clz = cu.addClass(this.type);

            clz.addAnnotation(
                    new SingleMemberAnnotationExpr(
                            new Name("com.fasterxml.jackson.annotation.JsonInclude"),
                            new NameExpr(
                                    "com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL")));

            var sortedFields = this.fields.keySet().stream().sorted().collect(Collectors.toList());
            var sb = new StringBuilder();
            sb.append("{");
            for (var s : sortedFields.toArray()) {
                sb.append("\"" + sortedFields.remove(0) + "\"");
                if (!sortedFields.isEmpty()) {
                    sb.append(",");
                }
            }
            sb.append("}");

            clz.addAnnotation(
                    new SingleMemberAnnotationExpr(
                            new Name("com.fasterxml.jackson.annotation.JsonPropertyOrder"),
                            new NameExpr(sb.toString())));

            clz.addAnnotation(
                    new SingleMemberAnnotationExpr(
                            new Name("com.fasterxml.jackson.databind.annotation.JsonDeserialize"),
                            new NameExpr(
                                    "using = com.fasterxml.jackson.databind.JsonDeserializer.None.class")));

            clz.addAnnotation("lombok.ToString");
            clz.addAnnotation("lombok.EqualsAndHashCode");
            clz.addAnnotation("lombok.Setter");

            clz.addAnnotation(
                    new SingleMemberAnnotationExpr(
                            new Name("lombok.experimental.Accessors"),
                            new NameExpr("prefix = {\n" + "    \"_\",\n" + "    \"\"\n" + "}")));

            clz.addAnnotation(
                    new SingleMemberAnnotationExpr(
                            new Name("io.sundr.builder.annotations.Buildable"),
                            new NameExpr(
                                    "editableEnabled = false, validationEnabled = false, generateBuilderPackage = false, builderPackage = \"io.fabric8.kubernetes.api.builder\", refs = {\n"
                                            + "    @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.ObjectMeta.class),\n"
                                            + "    @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.ObjectReference.class),\n"
                                            + "    @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.LabelSelector.class),\n"
                                            + "    @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.Container.class),\n"
                                            + "    @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.EnvVar.class),\n"
                                            + "    @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.ContainerPort.class),\n"
                                            + "    @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.Volume.class),\n"
                                            + "    @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.VolumeMount.class)\n"
                                            + "}")));

            clz.addImplementedType("io.fabric8.kubernetes.api.model.KubernetesResource");
        }

        if (this.preserveUnknownFields) {
            if (!clz.getFieldByName("additionalProperties").isPresent()) {
                var mapType =
                        new ClassOrInterfaceType()
                                .setName("java.util.Map")
                                .setTypeArguments(
                                        new ClassOrInterfaceType().setName("String"),
                                        new ClassOrInterfaceType().setName("Object"));
                var objField =
                        clz.addField(mapType, "additionalProperties", Modifier.Keyword.PRIVATE);
                objField.setVariables(
                        new NodeList<>(
                                new VariableDeclarator()
                                        .setName("additionalProperties")
                                        .setType(mapType)
                                        .setInitializer(
                                                "new java.util.HashMap<String, Object>()")));

                objField.addAnnotation("com.fasterxml.jackson.annotation.JsonIgnore");

                objField.createGetter()
                        .addAnnotation("com.fasterxml.jackson.annotation.JsonAnyGetter");
                objField.createSetter()
                        .addAnnotation("com.fasterxml.jackson.annotation.JsonAnySetter");
            } else {
                // Warning ???
            }
        }

        var buffer = new ArrayList<String>(this.fields.size() + 1);
        for (var k : this.fields.keySet()) {
            var prop = this.fields.get(k);
            buffer.addAll(prop.generateJava(cu));

            var fieldName = JSONSchema2Pojo.sanitizeString(k);
            var fieldType = JSONSchema2Pojo.sanitizeString(prop.getType());

            if (!clz.getFieldByName(fieldName).isPresent()) {
                try {
                    var objField = clz.addField(fieldType, fieldName, Modifier.Keyword.PRIVATE);
                    objField.addAnnotation(
                            new SingleMemberAnnotationExpr(
                                    new Name("com.fasterxml.jackson.annotation.JsonProperty"),
                                    new StringLiteralExpr(fieldName)));
                    objField.createGetter();
                    objField.createSetter();
                } catch (Exception cause) {
                    throw new RuntimeException(
                            "Error generating field " + fieldName + " with type " + prop.getType(),
                            cause);
                }
            } else {
                // Warning ???
            }
        }
        buffer.add(this.type);

        return buffer;
    }
}
