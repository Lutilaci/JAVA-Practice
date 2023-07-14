package com.java.geometry.shapes;

public abstract class Shape {

    protected double perimeter;
    protected double area;
    protected String perimeterFormula;
    protected String areaFormula;
    protected String fileName;

    protected Shape() {}

    public double calculateArea() {
        return area;
    }

    public double calculatePerimeter() {
        return perimeter;
    }

    public String getPerimeterFormula() {return perimeterFormula;}

    public String getAreaFormula() {return areaFormula;}

    public abstract String returnFileName();

    public static boolean checkIfArgsGreaterThanZero(float... args) {
        return false;
    }
}
