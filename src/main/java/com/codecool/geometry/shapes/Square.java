package com.codecool.geometry.shapes;

public class Square extends Rectangle {

    public Square(int a){
        super(a, a);
    }

    public String returnFileName(){
        return "Square";
    }

    @Override
    public String toString() {
        return String.format("Square, a = %d", getA());
    }

}
