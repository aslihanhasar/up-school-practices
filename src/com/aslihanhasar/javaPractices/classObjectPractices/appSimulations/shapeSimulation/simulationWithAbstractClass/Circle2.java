package com.aslihanhasar.javaPractices.classObjectPractices.appSimulations.shapeSimulation.simulationWithAbstractClass;

import static java.lang.Math.*;


public class Circle2 extends Shape2 {

    private final double radius;

    public Circle2(double radius){
        super();
        this.radius=radius;
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
}
