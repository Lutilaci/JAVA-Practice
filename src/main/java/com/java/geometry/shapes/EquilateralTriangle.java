package com.java.geometry.shapes;

public class EquilateralTriangle extends Triangle {

    private final int a;

    public EquilateralTriangle(int a){
        super(a, a, a);
        this.a = a;
        super.area = a * a * Math.sqrt(3)/4;
        super.perimeter = 3 * a;
        super.areaFormula = " a×a×sqrt(3)/4";
        super.perimeterFormula = " 3×a";
    }

    public String returnFileName(){
        return "Equilateral Triangle";
    }

    public String toString(){
        return String.format("Equilateral Triangle, a = %d", a);
    }
}
