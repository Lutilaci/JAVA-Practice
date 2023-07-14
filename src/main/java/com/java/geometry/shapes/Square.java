package com.java.geometry.shapes;

public class Square extends Rectangle {

    private final int a;

    public Square(int a){
        super(a, a);
        super.perimeter = 4 * a;
        super.area = a * a;
        super.fileName = "Square";
        this.a = a;
    }

    public String returnFileName(){
        return fileName;
    }

    public String toString() {
        return String.format("Square, a = %d", a);
    }
}
