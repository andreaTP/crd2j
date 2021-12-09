package org.crd2j.ast;

import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.Modifier;
import com.github.javaparser.ast.NodeList;
import com.github.javaparser.ast.body.VariableDeclarator;
import com.github.javaparser.ast.type.ClassOrInterfaceType;
import io.fabric8.kubernetes.api.model.apiextensions.v1.JSONSchemaProps;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JObject implements JSONSchema2Pojo {

    private String type = null;
    private Map<String, JSONSchema2Pojo> fields = new HashMap<>();
    private boolean preserveUnknownFields = false;

    public JObject(
            String type, Map<String, JSONSchemaProps> fields, boolean preserveUnknownFields) {
        this.preserveUnknownFields = preserveUnknownFields;
        this.type =
                JSONSchema2Pojo.sanitizeString(
                        type.substring(0, 1).toUpperCase() + type.substring(1));

        if (fields == null) {
            // no fields ???
        } else {
            for (var field : fields.entrySet()) {
                this.fields.put(
                        field.getKey(),
                        JSONSchema2Pojo.fromJsonSchema(field.getKey(), field.getValue()));
            }
        }
    }

    @Override
    public String getType() {
        return this.type;
    }

    @Override
    public List<String> generateJava(CompilationUnit cu) {
        var clz = cu.getClassByName(this.type).orElse(cu.addClass(this.type));

        if (this.preserveUnknownFields) {
            if (!clz.getFieldByName("properties").isPresent()) {
                var mapType =
                        new ClassOrInterfaceType()
                                .setName("java.util.Map")
                                .setTypeArguments(
                                        new ClassOrInterfaceType().setName("String"),
                                        new ClassOrInterfaceType().setName("Object"));
                var objField = clz.addField(mapType, "properties", Modifier.Keyword.PRIVATE);
                objField.setVariables(
                        new NodeList<>(
                                new VariableDeclarator()
                                        .setName("properties")
                                        .setType(mapType)
                                        .setInitializer(
                                                "new java.util.HashMap<String, Object>()")));

                objField.addAnnotation("com.fasterxml.jackson.annotation.JsonAnyGetter");
                objField.addAnnotation("com.fasterxml.jackson.annotation.JsonAnySetter");

                objField.createGetter()
                        .addAnnotation("com.fasterxml.jackson.annotation.JsonIgnore");
                objField.createSetter()
                        .addAnnotation("com.fasterxml.jackson.annotation.JsonProperty");
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
