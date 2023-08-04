package org.geekhub.homework.oop;

public class Triangle extends BaseShape {
    private final double sideA;
    private final double sideB;
    private final double sideC;

    public Triangle(String shapeName, double sideA, double sideB, double sideC) {
        super(shapeName);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double calculateArea() {
        double semiPerimeter = calculatePerimeter() / 2;
        return Math.sqrt(semiPerimeter * (semiPerimeter - sideA) * (semiPerimeter - sideB)
            * (semiPerimeter - sideC));
    }

    @Override
    public double calculatePerimeter() {
        return sideA + sideB + sideC;
    }
}
