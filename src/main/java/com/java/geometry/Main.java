package com.java.geometry;

import java.io.IOException;
import java.util.*;
import com.java.geometry.containers.ShapeCollection;
import com.java.geometry.shapes.*;

public class Main {

    public static void main(String[] args) throws IOException {

        ShapeCollection listShapes = new ShapeCollection();
        Scanner input = new Scanner(System.in);
        boolean isRunning = true;

	    while (isRunning) {
            System.out.println("\n");
            System.out.println("Choose an option:");
            System.out.println("1: Add new shape");
            System.out.println("2: Show all shapes");
            System.out.println("3: Show shape with the largest perimeter");
            System.out.println("4: Show shape with the largest area");
            System.out.println("5: Show formulas");
            System.out.println("0: Exit");
            int option = input.nextInt();

            switch (option) {
                case 1:
                    System.out.println("\n");
                    System.out.println("Choose a shape: ");
                    System.out.println("1: Circle\n" + "2: Equilateral Triangle\n" + "3: Rectangle\n" + "4: Regular Pentagon\n" + "5: Square\n" + "6: Triangle");
                    int shape = input.nextInt();
                    switch (shape) {
                        case 1:
                            System.out.println("Type radius: ");
                            int radius = input.nextInt();
                            input.nextLine();
                            listShapes.addShape(new Circle(radius));
                            break;
                        case 2:
                            System.out.println("Type the length of the side: ");
                            int side = input.nextInt();
                            listShapes.addShape(new EquilateralTriangle(side));
                            break;
                        case 3:
                            System.out.println("Type the height: ");
                            int height = input.nextInt();
                            System.out.println("Type the width: ");
                            int width = input.nextInt();
                            input.nextLine();
                            listShapes.addShape(new Rectangle(height, width));
                            break;
                        case 4:
                            System.out.println("Type the length of the side: ");
                            int rps = input.nextInt();
                            listShapes.addShape(new RegularPentagon(rps));
                            break;
                        case 5:
                            System.out.print("Insert size of the side: ");
                            int sideLength = input.nextInt();
                            listShapes.addShape(new Square(sideLength));
                            break;
                        case 6:
                            System.out.print("Insert int base: ");
                            int base = input.nextInt();
                            System.out.print("Insert int lSide: ");
                            int lSide = input.nextInt();
                            System.out.print("Insert int rSide: ");
                            int rSide = input.nextInt();
                            listShapes.addShape(new Triangle(base, lSide, rSide));
                    }
                    System.out.println(ShapeCollection.getShapes());
                    break;
                case 2:
                    System.out.println(listShapes.getShapesTable());
                    break;
                case 3:
                    double perimeterMax = listShapes.getLargestPerimeter();
                    System.out.println("The largest shape by perimeter is: " + ShapeCollection.getLargestShapeByPerimeter());
                    System.out.println("It's perimeter is: " + perimeterMax + "\n");
                    break;
                case 4:
                    double areaMax = listShapes.getLargestArea();
                    System.out.println("The largest shape by area is: " + ShapeCollection.getLargestShapeByArea());
                    System.out.println("It's area is: " + areaMax + "\n");
                    break;
                case 5:
                    ShapeCollection.showFormulas();
                    break;
                case 0:
                    isRunning = false;
                    break;
            }
        }
    }
}


