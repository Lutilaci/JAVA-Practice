package com.java.geometry.shapes;

public class Triangle extends Shape {

    private final int a;
    private final int b;
    private final int c;

    public Triangle(int a, int b, int c){
        double s = (double) (a + b + c) /2;
        this.a = a;
        this.b = b;
        this.c = c;
        super.area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        super.perimeter = a+b+c;
        super.areaFormula = " sqrt(s×(s-a)×(s-b)×(s-c)";
        super.perimeterFormula = "a+b+c";
        super.fileName = "Triangle";
    }

    public String returnFileName(){
        return fileName;
    }

    public String toString() {
        return String.format("Triangle, a=%d, b=%d, c=%d", a, b, c);
    }
}
