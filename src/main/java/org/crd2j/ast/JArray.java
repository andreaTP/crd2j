package org.crd2j.ast;

import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.type.ClassOrInterfaceType;
import java.util.List;

public class JArray implements JSONSchema2Pojo {

    private String type = null;
    private JSONSchema2Pojo nested = null;

    public JArray(JSONSchema2Pojo nested) {
        this.type =
                new ClassOrInterfaceType()
                        .setName("java.util.List")
                        .setTypeArguments(new ClassOrInterfaceType().setName(JSONSchema2Pojo.sanitizeString(nested.getType())))
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
