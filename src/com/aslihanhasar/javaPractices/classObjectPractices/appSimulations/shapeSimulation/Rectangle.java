package com.aslihanhasar.javaPractices.classObjectPractices.appSimulations.shapeSimulation;



public class Rectangle extends Shape {

    public Rectangle(double width, double length) {
        super();
        this.width = width;
        this.length = length;
    }

    @Override
    public void drawShape() {
        setNameOfShape("Rectangle");
        super.drawShape();
    }

    @Override
    public void eraseShape() {
        setNameOfShape("Rectangle");
        super.eraseShape();
    }

    @Override
    public double calculateArea() {
        return super.calculateArea();
    }

    @Override
    public double calculateCircumference() {
        return super.calculateCircumference();
    }
}
