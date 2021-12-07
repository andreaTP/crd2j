package org.crdfromjava;

public class PrimitiveJavaNameAndType extends JavaNameAndType {

    public PrimitiveJavaNameAndType(String name, JavaType type) {
        super(name, type);
    }

    public PrimitiveJavaNameAndType(String name) {
        super(name, JavaType.PRIMITIVE);
    }
}
