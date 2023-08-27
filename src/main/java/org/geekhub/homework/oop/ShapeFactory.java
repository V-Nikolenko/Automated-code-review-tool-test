package org.geekhub.homework.oop;

import java.util.Scanner;

public class ShapeFactory {

    private ShapeFactory() {
    }

    public static BaseShape createShape(String message) {
        Scanner scanner = new Scanner(System.in);
        BaseShape shape;
        while (true) {
            System.out.print("Enter " + message + " name:");
            String shapeName = scanner.nextLine().trim().toLowerCase();
            shape = switch (shapeName) {
                case "circle" -> new Circle(
                    "circle",
                    shapeParameter(scanner, "radius")
                );
                case "rectangle" -> new Rectangle(
                    "rectangle",
                    shapeParameter(scanner, "width"),
                    shapeParameter(scanner, "height")
                );
                case "square" -> new Square(
                    "square",
                    shapeParameter(scanner, "side")
                );
                case "triangle" -> new Triangle(
                    "triangle",
                    shapeParameter(scanner, "sideA"),
                    shapeParameter(scanner, "sideB"),
                    shapeParameter(scanner, "sideC")
                );
                default -> null;
            };
            if (shape == null) {
                System.out.println("This type shape is not exists!");
                continue;
            }
            return shape;
        }
    }

    private static double shapeParameter(Scanner scanner, String message) {
        while (true) {
            System.out.print("Enter " + message + ":");
            double shapeParameter = scanner.nextDouble();
            if (shapeParameter < 0) {
                System.out.println(message + " should be positive value!");
                continue;
            }
            return shapeParameter;
        }
    }
}
