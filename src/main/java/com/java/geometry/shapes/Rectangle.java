package com.java.geometry.shapes;

public class Rectangle extends Shape {

    private final int a;
    private final int b;

    public Rectangle (int a, int b){
        this.a = a;
        this.b = b;
        super.area = this.a * this.b;
        super.perimeter = 2 * (this.a + this.b);
        super.areaFormula = " a×b";
        super.perimeterFormula = " 2*(a+b)";
    }

    public String toString() {
        return String.format("Rectangle, a = %d, b = %d", a, b);
    }

    public String returnFileName(){
        return "Rectangle";
    }
}
