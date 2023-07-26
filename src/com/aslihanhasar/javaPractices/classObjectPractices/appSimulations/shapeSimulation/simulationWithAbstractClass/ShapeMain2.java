package com.aslihanhasar.javaPractices.classObjectPractices.appSimulations.shapeSimulation.simulationWithAbstractClass;

public class ShapeMain2 {

    public static void main(String[] args) {
        ShapeFactory2 shapeFactory=new ShapeFactory2();
        Canvas2 canvas=new Canvas2();

        Shape2 shape=shapeFactory.createShape();
        String nameOfShape=shape.getClass().getSimpleName();
        shape.setNameOfShape(nameOfShape);
        canvas.drawShape(shape);
        shapeFactory.getExtraInformation(shape);
        double areaOfShape=shape.calculateArea();
        System.out.println("Area: "+areaOfShape);
        double circumferenceOfShape=shape.calculateCircumference();
        System.out.println("Circumference : "+circumferenceOfShape);
        canvas.eraseShape(shape);
    }

}
