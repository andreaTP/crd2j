package org.crdfromjava;

import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.type.ClassOrInterfaceType;
import io.fabric8.kubernetes.api.model.apiextensions.v1.JSONSchemaProps;

import java.util.List;

public class PojoArray implements SchemaToPojo {

    private String type = null;
    private SchemaToPojo nested = null;

    PojoArray(JSONSchemaProps props, SchemaToPojo nested) {
        this.type = new ClassOrInterfaceType()
                .setName("java.util.List")
                .setTypeArguments(new ClassOrInterfaceType().setName(nested.getType()))
                .toString();
        this.nested = nested;
    }

    @Override
    public String getType() {
        return this.type;
    }

    @Override
    public List<String> generateJava(CompilationUnit cu) {
        return nested.generateJava(cu);
    }
}
