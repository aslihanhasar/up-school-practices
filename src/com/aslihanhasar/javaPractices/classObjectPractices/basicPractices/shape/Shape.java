package com.aslihanhasar.javaPractices.classObjectPractices.basicPractices.shape;

public class Shape {
    protected String nameOfShape;
    protected int width;
    protected int length;

    public Shape(int width, int length) {
        this.width = width;
        this.length = length;
    }

    public void drawAShape() {
        System.out.println(nameOfShape+" shape created.");
    }

    public void eraseAShape() {
        System.out.println(nameOfShape + " shape erased.");
    }

    public double calculateArea() {
        return 0.0;
    }

    public double calculatePerimeter() {
        return 0.0;
    }

    public String getNameOfShape() {
        return nameOfShape;
    }

    public void setNameOfShape(String nameOfShape) {
        this.nameOfShape = nameOfShape;
    }

}
