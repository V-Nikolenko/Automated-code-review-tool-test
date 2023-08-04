package org.geekhub.homework.oop;

public interface Shape {
    double calculateArea();

    double calculatePerimeter();

    default String isBiggestShape(Shape that) {
        if (this.calculateArea() > that.calculateArea()) {
            return "figure1 is bigger than figure2";
        }
        if (this.calculateArea() < that.calculateArea()) {
            return "figure2 is bigger than figure1";
        }
        return "figure1 equals figure2";
    }
}
