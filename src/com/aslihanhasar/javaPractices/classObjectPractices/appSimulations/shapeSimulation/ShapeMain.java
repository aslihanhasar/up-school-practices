package com.aslihanhasar.javaPractices.classObjectPractices.appSimulations.shapeSimulation;

public class ShapeMain {
    public static void main(String[] args) {
        Canvas canvas = new Canvas();

        Shape shapeCircle = new Circle(10);
        canvas.drawShape(shapeCircle);
        canvas.eraseShape(shapeCircle);
        var perimeter = shapeCircle.calculateCircumference();
        System.out.println(perimeter);
        System.out.println();
        Shape shapeRectangle = new Rectangle(6, 10);
        canvas.drawShape(shapeRectangle);
        canvas.eraseShape(shapeRectangle);
        System.out.println();
        Shape shapeRightTriangle = new RightTriangle(3, 4);
        canvas.drawShape(shapeRightTriangle);
        canvas.eraseShape(shapeRightTriangle);
        System.out.println();
        Shape shapeSquare = new Square(5);
        canvas.drawShape(shapeSquare);
        canvas.eraseShape(shapeSquare);
        System.out.println();

        ShapeFactory shapeFactory = new ShapeFactory();

        Shape randomShape = shapeFactory.createShape();
        canvas.drawShape(randomShape);
        var area = randomShape.calculateArea();
        System.out.println("Area: " + area);
        var circumference = randomShape.calculateCircumference();
        System.out.println("Circumference: " + circumference);
        shapeFactory.printInfo(randomShape);
        canvas.eraseShape(randomShape);
    }
}
