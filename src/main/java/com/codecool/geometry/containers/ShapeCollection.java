package com.codecool.geometry.containers;

import com.codecool.geometry.shapes.Shape;
import com.codecool.geometry.utilities.FormulaProvider;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShapeCollection {

    public static List<Shape> shapes = new ArrayList<>();

    public void addShape(Shape shape){
        shapes.add(shape);
    }

    public List<Shape> getShapes() {
        return shapes;
    }

    public static String getLargestShapeByPerimeter(){
        String shape = "";
        for(Shape p:shapes){
            shape = p.returnFileName();
        }return shape;
    }

    public static String getLargestShapeByArea(){
        String shape = "";
        for(Shape p:shapes){
            shape = p.returnFileName();
        }return shape;
    }

    public List<Integer> getLargestPerimeter(){
        List<Integer> perimeterMax = new ArrayList<>();
        for(Shape p:shapes){
            perimeterMax.add((int) p.calculatePerimeter());
        }return Collections.singletonList(Collections.max(perimeterMax, null));
    }

    public Integer getLargestArea(){
        List<Integer> areaMax = new ArrayList<>();
        for(Shape p:shapes){
            areaMax.add((int) p.calculateArea());
        }return Collections.max(areaMax,null);
    }

    public StringBuilder getShapesTable(){
        int count=0;
        StringBuilder sb = new StringBuilder();
        String leftAlignFormat = "| %-3s | %-23s | %-28s | %-15s | %-13s | %-8s | %-28s |%n";
        sb.append(String.format("O------------------------------------------------------------------------------------------------------------------------------------------O%n" +
                                "| ID  |        Class            |           toString           |    Perimeter    |    Formula    |   Area   |           Formula            |%n" +
                                "|-----|------------------------ |------------------------------|-----------------|---------------|----------|------------------------------|%n"));
        for(Shape p: shapes){
            sb.append(String.format(leftAlignFormat, count, p.returnFileName(), p.toString(), String.format("%.2f",p.calculatePerimeter()), FormulaProvider.getPerimeterForShape(p.returnFileName()), String.format("%.2f",p.calculateArea()), FormulaProvider.getAreaForShape(p.returnFileName())));
            if (count + 1 < shapes.size()){
                sb.append(String.format("|-----|------------------------ |------------------------------|-----------------|---------------|----------|------------------------------|%n"));
                count++;
            } else {
                sb.append(String.format("O------------------------------------------------------------------------------------------------------------------------------------------O%n"));
            }
        }
        return new StringBuilder(sb.toString());

    }
    public static void showFormulas(){
        for(Shape p: shapes)
            System.out.println(p.returnFileName() + " formulas are:\n" + "Perimeter: " + FormulaProvider.getPerimeterForShape(p.returnFileName()) + "\nArea: " + FormulaProvider.getAreaForShape(p.returnFileName()) + "\n");
    }
}
