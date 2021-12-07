package org.crdfromjava;

public class ObjectJavaNameAndType extends JavaNameAndType {
    public ObjectJavaNameAndType(String name, JavaType type) {
        super(name, type);
    }

    public ObjectJavaNameAndType(String name) {
        super(name, JavaType.OBJECT);
    }
}
