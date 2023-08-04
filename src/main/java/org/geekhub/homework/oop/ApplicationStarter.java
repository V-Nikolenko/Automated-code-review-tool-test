package org.geekhub.homework.oop;

public class ApplicationStarter {
    public static void main(String[] args) {
        BaseShape figure1 = ShapeFactory.createShape("figure1");
        BaseShape figure2 = ShapeFactory.createShape("figure2");
        System.out.println(figure1);
        System.out.println(figure2);
        System.out.println(figure1.isBiggestShape(figure2));
    }
}
