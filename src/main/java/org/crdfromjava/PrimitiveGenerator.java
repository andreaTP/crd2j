package org.crdfromjava;

import com.github.javaparser.ast.CompilationUnit;

import java.util.List;

public class PrimitiveGenerator implements JSONSchemaToPojoGenerator {
    private String type;

    PrimitiveGenerator(String type) {
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
