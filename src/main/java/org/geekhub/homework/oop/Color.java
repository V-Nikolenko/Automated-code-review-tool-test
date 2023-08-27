package org.geekhub.homework.oop;

public enum Color {
    RED("red"),
    BLUE("blue"),
    GREEN("green"),
    BLACK("black"),
    WHITE("white");

    private final String code;

    Color(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
