package com.aslihanhasar.javaPractices.classObjectPractices.appSimulations.shapeSimulation.simulationWithAbstractClass;

import static java.lang.Math.*;

public class Square2 extends Shape2 {
    private final double side;

    public Square2(double side){
        super();
        this.side=side;
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
}
