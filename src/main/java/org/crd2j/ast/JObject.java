package org.crd2j.ast;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.databind.JsonNode;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.Modifier;
import com.github.javaparser.ast.NodeList;
import com.github.javaparser.ast.body.VariableDeclarator;
import com.github.javaparser.ast.expr.Expression;
import com.github.javaparser.ast.type.ClassOrInterfaceType;
import com.github.javaparser.ast.visitor.GenericVisitor;
import com.github.javaparser.ast.visitor.VoidVisitor;
import io.fabric8.kubernetes.api.model.apiextensions.v1.JSONSchemaProps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JObject implements JSONSchema2Pojo {

    private String type = null;
    private Map<String, JSONSchema2Pojo> fields = new HashMap<>();
    private boolean preserveUnknownFields = false;

    public JObject(String type, Map<String, JSONSchemaProps> fields, boolean preserveUnknownFields) {
        this.preserveUnknownFields = preserveUnknownFields;
        this.type = type.substring(0, 1).toUpperCase() + type.substring(1);

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
                var mapType = new ClassOrInterfaceType()
                        .setName("java.util.Map")
                        .setTypeArguments(
                                new ClassOrInterfaceType().setName("String"),
                                new ClassOrInterfaceType().setName("Object")
                        );
                var objField = clz.addField(mapType, "properties", Modifier.Keyword.PRIVATE);
                objField.setVariables(new NodeList<>(
                        new VariableDeclarator()
                                .setName("properties")
                                .setType(mapType)
                                .setInitializer("new java.util.HashMap<String, Object>()")));

                objField.addAnnotation("com.fasterxml.jackson.annotation.JsonIgnore");
                objField.addAnnotation("com.fasterxml.jackson.annotation.JsonAnyGetter");
                objField.addAnnotation("com.fasterxml.jackson.annotation.JsonAnySetter");

                objField.createGetter();
                objField.createSetter();
            } else {
                // Warning ???
            }
        }

        var buffer = new ArrayList<String>(this.fields.size() + 1);
        for (var k : this.fields.keySet()) {
            var prop = this.fields.get(k);
            buffer.addAll(prop.generateJava(cu));

            var fieldName = sanitizeFieldName(k);

            if (!clz.getFieldByName(fieldName).isPresent()) {
                var objField = clz.addField(prop.getType(), fieldName, Modifier.Keyword.PRIVATE);
                objField.createGetter();
                objField.createSetter();
            } else {
                // Warning ???
            }
        }
        buffer.add(this.type);

        return buffer;
    }

    private String sanitizeFieldName(String key) {
        if (javaKeywords
                .stream()
                .filter((s) -> s.equals(key))
                .findFirst()
                .isPresent()
        ) {
            return "_" + key;
        } else {
            return key;
        }
    }

    private List<String> javaKeywords = List.of(
        "abstract", "continue", "for", "new", "switch",
        "assert", "default", "goto", "package", "synchronized",
        "boolean", "do", "if", "private", "this",
        "break", "double", "implements", "protected", "throw",
        "byte", "else", "import", "public", "throws",
        "case", "enum", "instanceof", "return", "transient",
        "catch", "extends", "int", "short", "try",
        "char", "final", "interface", "static", "void",
        "class", "finally", "long", "strictfp**", "volatile",
        "const", "float", "native", "super", "while"
    );
}

