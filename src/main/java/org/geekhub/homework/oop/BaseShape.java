package org.geekhub.homework.oop;

public abstract class BaseShape implements Shape {
    private final String shapeName;
    private final Color color = Color.BLACK;

    public BaseShape(String shapeName) {
        this.shapeName = shapeName;
    }

    @Override
    public String toString() {
        return """
            -a %s
            -area-%s
            -perimeter-%s
            -color-%s
            """
            .formatted(shapeName, calculateArea(), calculatePerimeter(), color);
    }
}
