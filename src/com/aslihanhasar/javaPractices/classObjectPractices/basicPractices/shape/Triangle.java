package com.aslihanhasar.javaPractices.classObjectPractices.basicPractices.shape;

import static java.lang.Math.*;

public class Triangle extends Shape {

    public Triangle(int width, int length) {
        super(width, length);
    }

    @Override
    public double calculateArea() {
        return (double) (width * length) / 2;
    }

    @Override
    public double calculatePerimeter() {
        var perimeter = sqrt((width * width) + (length * length));
        return perimeter + width + length;
    }

}
