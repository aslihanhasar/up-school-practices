package com.aslihanhasar.javaPractices.classObjectPractices.appSimulations.shapeSimulation.simulationWithAbstractClass;

import static java.lang.Math.*;

public class RightTriangle2 extends Shape2{
    public RightTriangle2(double width,double length){
        super();
        this.width=width;
        this.length=length;
    }

    @Override
    public double calculateArea() {
        return (width*length)/2;
    }

    @Override
    public double calculateCircumference() {
        double hypotenuse = sqrt((pow(width, 2)) + (pow(length, 2)));
        return width + length + hypotenuse;
    }
}
