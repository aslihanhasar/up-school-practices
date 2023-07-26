package com.aslihanhasar.javaPractices.classObjectPractices.basicPractices.shape;

public class Rectangle extends Shape {

    public Rectangle(int width, int length) {
        super(width, length);
    }

    @Override
    public double calculateArea() {
        return width * length;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (width + length);
    }

    public void differentMethod(){
        System.out.println("dsgklsdfs");
    }

}

