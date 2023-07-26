package com.aslihanhasar.javaPractices.classObjectPractices.basicPractices.circle;

public class Circle {
    double radius;


    public Circle(){
       // radius=10.0;
        this(10);
    }

    public Circle(double newRadius){
        radius=newRadius;
    }

    public double getPiNumber(){
        return Math.PI;
    }
    public double calculateArea(double radius){
      return getPiNumber()*(Math.pow(radius,2));
    }

    public double calculatePerimeter(double radius){
        return 2*getPiNumber()*radius;
    }


}
