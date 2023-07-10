package com.codecool.geometry.shapes;

public class Rectangle extends Shape {

    private final int a;
    private final int b;

    public Rectangle (int a, int b){
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public String toString() {
        return String.format("Rectangle, a = %d, b = %d", a, b);
    }

    public String returnFileName(){
        return "Rectangle";
    }

    @Override
    public double calculateArea() {
        return this.a * this.b;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (this.a + this.b);
    }
}
