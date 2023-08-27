package org.geekhub.homework.oop;

public class Circle extends BaseShape {
    private final double radius;

    public Circle(String shapeName, double radius) {
        super(shapeName);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}
