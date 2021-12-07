package org.crdfromjava;

public class ArrayJavaNameAndType extends JavaNameAndType {
    public ArrayJavaNameAndType(String name, JavaType type) {
        super(name, type);
    }

    public ArrayJavaNameAndType(String name) {
        super(name, JavaType.ARRAY);
    }
}
