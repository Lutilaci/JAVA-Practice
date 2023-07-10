package com.codecool.geometry.shapes;

public class Circle extends Shape {

    private final int r;

    public Circle(int r){
        this.r = r;
    }

    public String toString(){
        return String.format("Circle, r = %d", r);
    }

    public String returnFileName(){
        return "Circle";
    }

    @Override
    public double calculateArea() {
        return Math.PI * this.r * this.r;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * this.r;
    }
}
