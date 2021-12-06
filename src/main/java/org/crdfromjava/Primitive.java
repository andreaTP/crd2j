package org.crdfromjava;

import com.github.javaparser.ast.CompilationUnit;
import io.fabric8.kubernetes.api.model.apiextensions.v1.JSONSchemaProps;

import java.util.List;

public class Primitive implements SchemaToPojo {
    private String type;

    Primitive(String type) {
        this.type = type;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public List<String> generateJava(CompilationUnit cu) {
        return List.of();
    }
}
