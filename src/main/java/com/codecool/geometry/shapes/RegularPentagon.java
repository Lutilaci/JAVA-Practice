package com.codecool.geometry.shapes;

public class RegularPentagon extends Shape {

    private final int a;

    public RegularPentagon(int a){
        this.a = a;
    }

    public String toString() {
        return String.format("Pentagon, a = %d", a);
    }

    public String returnFileName(){
        return "Regular Pentagon";
    }

    @Override
    public double calculateArea() {
        return this.a * this.a * Math.sqrt(5*(5+2*Math.sqrt(5)))/4;
    }

    @Override
    public double calculatePerimeter() {
        return 5 * this.a;
    }
}
