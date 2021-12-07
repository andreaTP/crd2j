package org.crdfromjava;

import com.github.javaparser.ast.CompilationUnit;
import io.fabric8.kubernetes.api.model.apiextensions.v1.JSONSchemaProps;

import java.util.List;

public interface JSONSchemaToPojoGenerator {

    String getType();

    List<String> generateJava(CompilationUnit cu);

    static JSONSchemaToPojoGenerator fromJsonSchema(String key, JSONSchemaProps prop) {
        if (prop.getXKubernetesIntOrString() != null && prop.getXKubernetesIntOrString()) {
            return fromJsonSchema(key, new PrimitiveJavaNameAndType("io.fabric8.kubernetes.api.model.IntOrString"), prop);
        } else {
            switch (prop.getType()) {
                case "boolean":
                    return fromJsonSchema(key, new PrimitiveJavaNameAndType("boolean"), prop);
                case "integer":
                    return fromJsonSchema(key, new PrimitiveJavaNameAndType("int"), prop);
                case "string":
                    return fromJsonSchema(key, new PrimitiveJavaNameAndType("String"), prop);
                case "object":
                    // Taking the schema defined in AdditionalProperties instead
                    if (prop.getAdditionalProperties() != null &&
                            prop.getAdditionalProperties().getSchema() != null) {
                        return fromJsonSchema(key, prop.getAdditionalProperties().getSchema());
                    } else {
                        return fromJsonSchema(key, new ObjectJavaNameAndType(key), prop);
                    }
                case "array":
                    return fromJsonSchema(key, new ArrayJavaNameAndType(key), prop);
                default:
                    throw new RuntimeException("unmanaged type " + prop.getType());
            }
        }
    }

    private static JSONSchemaToPojoGenerator fromJsonSchema(String key, JavaNameAndType nt, JSONSchemaProps prop) {
        switch (nt.getType()) {
            case PRIMITIVE:
                return new PrimitiveGenerator(nt.getName());
            case ARRAY:
                return new ArrayGenerator(fromJsonSchema(key, prop.getItems().getSchema()));
            case OBJECT:
                // Taking the schema defined in AdditionalProperties instead
                if (prop.getAdditionalProperties() != null &&
                        prop.getAdditionalProperties().getSchema() != null) {
                     return fromJsonSchema(key, prop.getAdditionalProperties().getSchema());
                } else {
                    return new ObjectGenerator(key, prop.getProperties());
                }
            default:
                throw new RuntimeException("unreachable " + nt.getType());
        }
    }
}
