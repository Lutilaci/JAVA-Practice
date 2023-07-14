package com.java.geometry.shapes;

public class Circle extends Shape {

    private final int r;

    public Circle(int r){
        this.r = r;
        super.area = Math.PI * this.r * this.r;
        super.perimeter = 2 * Math.PI * this.r;
        super.areaFormula = " π×r×r";
        super.perimeterFormula = " 4*a";
        super.fileName = "Circle";
    }

    public String toString(){
        return String.format("Circle, r = %d", r);
    }

    public String returnFileName(){
        return fileName;
    }
}
