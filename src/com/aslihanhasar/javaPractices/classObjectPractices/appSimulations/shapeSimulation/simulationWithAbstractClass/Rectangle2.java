package com.aslihanhasar.javaPractices.classObjectPractices.appSimulations.shapeSimulation.simulationWithAbstractClass;

public class Rectangle2 extends Shape2{

    public Rectangle2(double width,double length){
        super();
        this.width=width;
        this.length=length;
    }

    @Override
    public double calculateArea() {
        return width*length;
    }

    @Override
    public double calculateCircumference() {
        return 2*(width+length);
    }
}
