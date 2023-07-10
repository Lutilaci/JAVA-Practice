package com.codecool.geometry.shapes;

public class Triangle extends Shape {

    private final int a;
    private final int b;
    private final int c;


    public Triangle(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public String returnFileName(){
        return "Triangle";
    }

    public String toString() {
        return String.format("Triangle, a=%d, b=%d, c=%d", a, b, c);
    }

    @Override
    public double calculateArea() {
        double s = (a+b+c)/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }

    @Override
    public double calculatePerimeter() {
        return a+b+c;
    }
}
