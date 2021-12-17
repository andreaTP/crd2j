package org.crd2j.ast;

import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.expr.Name;
import com.github.javaparser.ast.expr.SingleMemberAnnotationExpr;
import com.github.javaparser.ast.expr.StringLiteralExpr;
import com.github.javaparser.ast.type.ClassOrInterfaceType;
import java.util.List;

public class JCRObject implements JSONSchema2Pojo {

    private String type;
    private String group;
    private String version;

    public JCRObject(String type, String group, String version) {
        this.type = type;
        this.group = group;
        this.version = version;
    }

    @Override
    public String getType() {
        return this.type;
    }

    @Override
    public List<String> generateJava(CompilationUnit cu) {
        var clz = cu.getClassByName(this.type).orElse(cu.addClass(this.type));

        clz.addAnnotation(
                new SingleMemberAnnotationExpr(
                        new Name("io.fabric8.kubernetes.model.annotation.Version"),
                        new StringLiteralExpr(version)));
        clz.addAnnotation(
                new SingleMemberAnnotationExpr(
                        new Name("io.fabric8.kubernetes.model.annotation.Group"),
                        new StringLiteralExpr(group)));

        var crType =
                new ClassOrInterfaceType()
                        .setName("io.fabric8.kubernetes.client.CustomResource")
                        .setTypeArguments(
                                new ClassOrInterfaceType().setName(this.type + "Spec"),
                                new ClassOrInterfaceType().setName(this.type + "Status"));

        clz.addExtendedType(crType);
        clz.addImplementedType("io.fabric8.kubernetes.api.model.Namespaced");

        return List.of(this.type);
    }
}
