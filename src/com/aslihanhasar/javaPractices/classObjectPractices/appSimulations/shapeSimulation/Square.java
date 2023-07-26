package com.aslihanhasar.javaPractices.classObjectPractices.appSimulations.shapeSimulation;

import static java.lang.Math.*;

public class Square extends Shape {
    private double side;

    public Square(double side) {
        super();
        this.side = side;
    }

    @Override
    public void drawShape() {
        setNameOfShape("Square");
        super.drawShape();
    }

    @Override
    public void eraseShape() {
        setNameOfShape("Square");
        super.eraseShape();
    }

    @Override
    public double calculateArea() {
        return pow(side,2);
    }

    @Override
    public double calculateCircumference() {
        return 4*side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
}
