package org.crd2j.ast;

import com.github.javaparser.ast.CompilationUnit;
import io.fabric8.kubernetes.api.model.apiextensions.v1.JSONSchemaProps;

import java.util.List;

public interface JSONSchema2Pojo {

    String getType();

    List<String> generateJava(CompilationUnit cu);

    static JSONSchema2Pojo fromJsonSchema(String key, JSONSchemaProps prop) {
        if (prop.getXKubernetesIntOrString() != null && prop.getXKubernetesIntOrString()) {
            return fromJsonSchema(key, new JPrimitiveNameAndType("io.fabric8.kubernetes.api.model.IntOrString"), prop);
        } else {
            switch (prop.getType()) {
                case "boolean":
                    return fromJsonSchema(key, new JPrimitiveNameAndType("boolean"), prop);
                case "integer":
                    return fromJsonSchema(key, new JPrimitiveNameAndType("int"), prop);
                case "string":
                    return fromJsonSchema(key, new JPrimitiveNameAndType("String"), prop);
                case "object":
                    // Taking the schema defined in AdditionalProperties instead
                    if (prop.getAdditionalProperties() != null &&
                            prop.getAdditionalProperties().getSchema() != null) {
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

    private static JSONSchema2Pojo fromJsonSchema(String key, JavaNameAndType nt, JSONSchemaProps prop) {
        switch (nt.getType()) {
            case PRIMITIVE:
                return new JPrimitive(nt.getName());
            case ARRAY:
                return new JArray(fromJsonSchema(key, prop.getItems().getSchema()));
            case OBJECT:
                // Taking the schema defined in AdditionalProperties instead
                if (prop.getAdditionalProperties() != null &&
                        prop.getAdditionalProperties().getSchema() != null) {
                     return fromJsonSchema(key, prop.getAdditionalProperties().getSchema());
                } else {
                    return new JObject(key, prop.getProperties());
                }
            default:
                throw new RuntimeException("unreachable " + nt.getType());
        }
    }
}
