package org.geekhub.homework.oop;

public class Rectangle extends BaseShape {
    private final double width;
    private final double height;

    public Rectangle(String shapeName, double width, double height) {
        super(shapeName);
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (width + height);
    }
}
