package com.codecool.geometry.shapes;

public class EquilateralTriangle extends Triangle {

    private final int a;

    public EquilateralTriangle(int a){
        super(a, a, a);
        this.a = a;
    }

    public String returnFileName(){
        return "Equilateral Triangle";
    }

    public String toString(){
        return String.format("Equilateral Triangle, a = %d", a);
    }
}
