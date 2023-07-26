package com.aslihanhasar.javaPractices.classObjectPractices.appSimulations.shapeSimulation;

import static java.lang.Math.*;

public class RightTriangle extends Shape {

    public RightTriangle(double width, double length) {
        super();
        this.width = width;
        this.length = length;
    }

    @Override
    public void drawShape() {
        setNameOfShape("Right Triangle");
        super.drawShape();
    }

    @Override
    public void eraseShape() {
        setNameOfShape("Right Triangle");
        super.eraseShape();
    }

    @Override
    public double calculateArea() {
        return super.calculateArea() / 2;
    }

    @Override
    public double calculateCircumference() {
        double hypotenuse = sqrt((pow(width, 2)) + (pow(length, 2)));
        return width + length + hypotenuse;
    }
}
