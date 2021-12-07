package org.crdfromjava;

public class JavaNameAndType {

    public JavaType getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    private JavaType type;
    private String name;

    public JavaNameAndType(String name, JavaType type) {
        this.name = name;
        this.type = type;
    }
}
