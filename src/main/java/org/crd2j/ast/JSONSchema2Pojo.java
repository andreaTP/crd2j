package org.crd2j.ast;

import static org.crd2j.ast.Keywords.javaKeywords;

import com.github.javaparser.ast.CompilationUnit;
import io.fabric8.kubernetes.api.model.apiextensions.v1.JSONSchemaProps;
import java.util.List;

public interface JSONSchema2Pojo {

    String getType();

    List<String> generateJava(CompilationUnit cu);

    static String sanitizeString(String str) {
        var sanitized = "";
        if (javaKeywords.stream().filter((s) -> s.equals(str)).findFirst().isPresent()) {
            sanitized = "_" + str;
        } else {
            sanitized = str;
        }

        if (sanitized.startsWith("-")) {
            sanitized = sanitized.replaceFirst("-", "minus");
        }

        var index = sanitized.indexOf('-');
        while (index != -1) {
            var next = Math.min(index + 2, sanitized.length());
            sanitized =
                    sanitized.substring(0, index)
                            + sanitized.substring(index + 1, next).toUpperCase()
                            + sanitized.substring(next);
            index = sanitized.indexOf('-');
        }

        return sanitized;
    }

    static JSONSchema2Pojo fromJsonSchema(String key, JSONSchemaProps prop) {
        if (prop.getXKubernetesIntOrString() != null && prop.getXKubernetesIntOrString()) {
            return fromJsonSchema(
                    key,
                    new JPrimitiveNameAndType("io.fabric8.kubernetes.api.model.IntOrString"),
                    prop);
        } else if (prop.getType() == null
                && prop.getXKubernetesPreserveUnknownFields() != null
                && prop.getXKubernetesPreserveUnknownFields()) {
            return fromJsonSchema(key, new JObjectNameAndType(key), prop);
        } else {
            if (prop.getType() == null) {
                throw new RuntimeException("Type for key:" + key + " is null");
            }

            switch (prop.getType()) {
                case "boolean":
                    return fromJsonSchema(key, new JPrimitiveNameAndType("Boolean"), prop);
                case "integer":
                    var intFormat = prop.getFormat();
                    if (intFormat == null) intFormat = "int64";

                    switch (intFormat) {
                        case "int32":
                            return fromJsonSchema(key, new JPrimitiveNameAndType("Integer"), prop);
                        case "int64":
                        default:
                            return fromJsonSchema(key, new JPrimitiveNameAndType("Long"), prop);
                    }
                case "number":
                    var numberFormat = prop.getFormat();
                    if (numberFormat == null) numberFormat = "double";

                    switch (numberFormat) {
                        case "float":
                            return fromJsonSchema(key, new JPrimitiveNameAndType("Float"), prop);
                        case "double":
                        default:
                            return fromJsonSchema(key, new JPrimitiveNameAndType("Double"), prop);
                    }
                case "string":
                    return fromJsonSchema(key, new JPrimitiveNameAndType("String"), prop);
                case "object":
                    // Taking the schema defined in AdditionalProperties instead
                    if (prop.getAdditionalProperties() != null
                            && prop.getAdditionalProperties().getSchema() != null) {
                        return fromJsonSchema(key, prop.getAdditionalProperties().getSchema());
                    } else {
                        return fromJsonSchema(key, new JObjectNameAndType(key), prop);
                    }
                case "array":
                    return fromJsonSchema(key, new JArrayNameAndType(key), prop);
                default:
                    throw new RuntimeException("unmanaged type " + prop.getType());
            }
        }
    }

    private static JSONSchema2Pojo fromJsonSchema(
            String key, JavaNameAndType nt, JSONSchemaProps prop) {
        switch (nt.getType()) {
            case PRIMITIVE:
                return new JPrimitive(nt.getName());
            case ARRAY:
                return new JArray(fromJsonSchema(key, prop.getItems().getSchema()));
            case OBJECT:
                // Taking the schema defined in AdditionalProperties instead
                if (prop.getAdditionalProperties() != null
                        && prop.getAdditionalProperties().getSchema() != null) {
                    return fromJsonSchema(key, prop.getAdditionalProperties().getSchema());
                } else {
                    var preserveUnknownFields =
                            (prop.getXKubernetesPreserveUnknownFields() != null
                                    && prop.getXKubernetesPreserveUnknownFields());
                    return new JObject(key, prop.getProperties(), preserveUnknownFields);
                }
            default:
                throw new RuntimeException("unreachable " + nt.getType());
        }
    }
}
