package org.crdfromjava;

import com.github.javaparser.ast.CompilationUnit;
import io.fabric8.kubernetes.api.model.apiextensions.v1.JSONSchemaProps;

import java.util.List;

public interface SchemaToPojo {

    String getType();

    List<String> generateJava(CompilationUnit cu);

    static SchemaToPojo fromJsonSchema(String key, JSONSchemaProps prop) {
        if (prop.getXKubernetesIntOrString() != null && prop.getXKubernetesIntOrString()) {
            return withType(key, "io.fabric8.kubernetes.api.model.IntOrString", prop);
        } else {
            return withType(key, prop.getType(), prop);
        }
    }

    private static SchemaToPojo withType(String key, String type, JSONSchemaProps prop) {
        switch (type) {
            case "io.fabric8.kubernetes.api.model.IntOrString":
                return new Primitive("io.fabric8.kubernetes.api.model.IntOrString");
            case "boolean":
                return new Primitive("boolean");
            case "integer":
                return new Primitive("int");
            case "string":
                return new Primitive("String");
            case "object":
                // Taking the schema defined in AdditionalProperties instead
                if (prop.getAdditionalProperties() != null &&
                        prop.getAdditionalProperties().getSchema() != null) {
                     return fromJsonSchema(key, prop.getAdditionalProperties().getSchema());
                } else {
                    return new PojoObject(key, prop.getProperties());
                }
            case "array":
                return new PojoArray(prop, SchemaToPojo.fromJsonSchema(key + "Array", prop.getItems().getSchema()));
            default:
                throw new RuntimeException("unknown type " + prop.getType());
        }
    }
}
