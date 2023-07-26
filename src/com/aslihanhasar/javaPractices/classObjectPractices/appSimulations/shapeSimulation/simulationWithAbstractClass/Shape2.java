package com.aslihanhasar.javaPractices.classObjectPractices.appSimulations.shapeSimulation.simulationWithAbstractClass;


public abstract class Shape2 {
    protected String nameOfShape;
    protected double width;
    protected double length;

    public void drawShape() {
        System.out.println(nameOfShape + " was drawn");
    }

    public void eraseShape() {
        System.out.println(nameOfShape + " was erased");
    }

    public abstract double calculateArea();

    public abstract double calculateCircumference();

    public String getNameOfShape() {
        return nameOfShape;
    }

    public void setNameOfShape(String nameOfShape) {
        this.nameOfShape = nameOfShape;
    }
}
