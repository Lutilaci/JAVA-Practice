package com.java.geometry.utilities;

import java.util.Objects;

public class FormulaProvider {

    public static String getAreaForShape(String shape) {
        if (Objects.equals(shape, "Square")){
            return " a*a";
        } else if (Objects.equals(shape, "Circle")){
            return " π×r×r";
        } else if (Objects.equals(shape, "Equilateral Triangle")){
            return " a×a×sqrt(3)/4";
        } else if (Objects.equals(shape, "Rectangle")){
            return " a×b";
        } else if (Objects.equals(shape, "Regular Pentagon")){
            return " a×a×sqrt(5×(5+2×sqrt(5))/4";
        } else if (Objects.equals(shape, "Triangle")){
            return " sqrt(s×(s-a)×(s-b)×(s-c)";
        }
        return "OK";
    }

    public static String getPerimeterForShape(String shape) {
        if (Objects.equals(shape, "Square")){
            return " 4*a";
        } else if (Objects.equals(shape, "Circle")){
            return " 2×π×r";
        } else if (Objects.equals(shape, "Equilateral Triangle")){
            return " 3×a";
        } else if (Objects.equals(shape, "Rectangle")){
            return " 2*(a+b)";
        } else if (Objects.equals(shape, "Regular Pentagon")){
            return " 5×a";
        } else if (Objects.equals(shape, "Triangle")){
            return "a+b+c";
        }
        return "OK";
    }
}
