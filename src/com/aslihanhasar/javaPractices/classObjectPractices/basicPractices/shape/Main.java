package com.aslihanhasar.javaPractices.classObjectPractices.basicPractices.shape;

public class Main {
    public static void main(String[] args) {
        Shape shape=new Shape(4,5);

        Shape shapeRectangle=new Rectangle(6,8);
        Shape shapeTriangle=new Triangle(10,10);

        double areaRectanle= shapeRectangle.calculateArea();
        double areaTriangle=shapeTriangle.calculateArea();

        System.out.println("Area Rectangle: "+areaRectanle);
        System.out.println("Area Triangle: "+areaTriangle);

    }
}
