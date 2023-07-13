package com.java.geometry.shapes;

public class RegularPentagon extends Shape {

    private final int a;

    public RegularPentagon(int a){
        this.a = a;
        super.area = this.a * this.a * Math.sqrt(5*(5+2*Math.sqrt(5)))/4;
        super.perimeter =  5 * this.a;
        super.areaFormula = " a×a×sqrt(5×(5+2×sqrt(5))/4";
        super.perimeterFormula = " 5×a";
    }

    public String toString() {
        return String.format("Pentagon, a = %d", a);
    }

    public String returnFileName(){
        return "Regular Pentagon";
    }
}
