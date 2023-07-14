package com.java.geometry.containers;

import com.java.geometry.shapes.Shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollection {

    public static List<Shape> shapes = new ArrayList<>();

    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    public static List<Shape> getShapes() {
        return shapes;
    }

    public static String getLargestShapeByPerimeter() {
        double perimeter = 0;
        String shape = "";
        for (Shape p : shapes) {
            if (p.calculatePerimeter() > perimeter) {
                perimeter = p.calculatePerimeter();
                shape = p.returnFileName();
            }
        }
        return shape;
    }

    public static String getLargestShapeByArea() {
        double area = 0;
        String shape = "";
        for (Shape p : shapes) {
            if (p.calculateArea() > area) {
                area = p.calculateArea();
                shape = p.returnFileName();
            }
        }
        return shape;
    }

    public double getLargestPerimeter() {
        double perimeter = 0;
        for (Shape p : shapes) {
            if (p.calculatePerimeter() > perimeter) {
                perimeter = p.calculatePerimeter();
            }
        }
        return perimeter;
    }

    public double getLargestArea() {
        double area = 0;
        for (Shape p : shapes) {
            if (p.calculateArea() > area) {
                area = p.calculateArea();
            }
        }
        return area;
    }

    public StringBuilder getShapesTable() {
        int count = 0;
        StringBuilder sb = new StringBuilder();
        String leftAlignFormat = "| %-3s | %-23s | %-28s | %-15s | %-13s | %-8s | %-28s |%n";
        sb.append(String.format("O------------------------------------------------------------------------------------------------------------------------------------------O%n" +
                "| ID  |        Class            |           toString           |    Perimeter    |    Formula    |   Area   |           Formula            |%n" +
                "|-----|------------------------ |------------------------------|-----------------|---------------|----------|------------------------------|%n"));
        for (Shape p : shapes) {
            sb.append(String.format(leftAlignFormat, count, p.returnFileName(), p.toString(), String.format("%.2f", p.calculatePerimeter()), p.getPerimeterFormula(), String.format("%.2f", p.calculateArea()), p.getAreaFormula()));
            if (count + 1 < shapes.size()) {
                sb.append(String.format("|-----|------------------------ |------------------------------|-----------------|---------------|----------|------------------------------|%n"));
                count++;
            } else {
                sb.append(String.format("O------------------------------------------------------------------------------------------------------------------------------------------O%n"));
            }
        }
        return new StringBuilder(sb.toString());
    }

    public static void showFormulas() {
        for (Shape p : shapes)
            System.out.println(p.returnFileName() + " formulas are:\n" + "Perimeter: " + p.getPerimeterFormula() + "\nArea: " + p.getAreaFormula() + "\n");
    }
}
