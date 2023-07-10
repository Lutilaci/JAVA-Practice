package com.codecool.geometry.shapes;

public abstract class Shape {

    public abstract double calculateArea();

    public abstract double calculatePerimeter();

    public abstract String returnFileName();

    public static boolean checkIfArgsGreaterThanZero(float... args) {
        return false;
    }


}
