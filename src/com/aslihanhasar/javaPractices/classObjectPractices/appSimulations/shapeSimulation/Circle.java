package com.aslihanhasar.javaPractices.classObjectPractices.appSimulations.shapeSimulation;

import static java.lang.Math.*;

public class Circle extends Shape {

    private double radius;

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    @Override
    public void drawShape() {
        setNameOfShape("Circle");
        super.drawShape();
    }

    @Override
    public void eraseShape() {
        setNameOfShape("Circle");
        super.eraseShape();
    }

    @Override
    public double calculateArea() {
        return PI * pow(radius, 2);
    }

    @Override
    public double calculateCircumference() {
        return 2 * PI * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
