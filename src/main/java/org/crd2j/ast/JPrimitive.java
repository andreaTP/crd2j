package org.crd2j.ast;

import com.github.javaparser.ast.CompilationUnit;

import java.util.List;

public class JPrimitive implements JSONSchema2Pojo {
    private String type;

    public JPrimitive(String type) {
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
