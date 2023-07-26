package com.aslihanhasar.javaPractices.classObjectPractices.appSimulations.shapeSimulation;


import static java.lang.Math.*;

public class ShapeFactory {

    public Shape createShape() {
        Shape shape = null;
        int i = (int) (5 * random());
        switch (i) {
            case 0 -> shape = new Shape();
            case 1 -> shape = new Circle(10);
            case 2 -> shape = new Rectangle(5, 10);
            case 3 -> shape = new Square(5);
            case 4 -> shape = new RightTriangle(3, 4);
        }
        return shape;
    }

    public void printInfo(Shape shape) {
        if (shape instanceof Circle circle) {
            double radius = circle.getRadius();
            System.out.println("Circle Radius: " + radius);
        } else if (shape instanceof Rectangle rectangle) {
            double width = rectangle.getWidth();
            double length = rectangle.getLength();
            System.out.println("Width of the rectangle: " + width +
                    "\n" + "Length of the rectangle: " + length);
        } else if (shape instanceof Square square) {
            double side = square.getSide();
            System.out.println("Square side length: " + side);
        } else if (shape instanceof RightTriangle triangle) {
            double width = triangle.getWidth();
            double length = triangle.getLength();
            System.out.println("Base of the right triangle: " + width +
                    "\n" + "Height of the right triangle: " + length);
        }
    }
}
