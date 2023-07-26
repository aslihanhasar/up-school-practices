package com.aslihanhasar.javaPractices.classObjectPractices.appSimulations.shapeSimulation;


public class Shape {
    private String nameOfShape;
    protected double width;
    protected double length;

    public void drawShape() {
        System.out.println(nameOfShape + " has been drawed.");
    }

    public void eraseShape() {
        System.out.println(nameOfShape + " has been erased.");
    }

    public double calculateArea() {
        return width * length;
    }

    public double calculateCircumference() {
        return 2 * (width + length);
    }

    public String getNameOfShape() {
        return nameOfShape;
    }

    public void setNameOfShape(String nameOfShape) {
        this.nameOfShape = nameOfShape;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
