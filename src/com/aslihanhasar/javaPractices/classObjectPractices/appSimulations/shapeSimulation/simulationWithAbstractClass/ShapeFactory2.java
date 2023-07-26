package com.aslihanhasar.javaPractices.classObjectPractices.appSimulations.shapeSimulation.simulationWithAbstractClass;

import static java.lang.Math.random;

public class ShapeFactory2 {

    public Shape2 createShape(){
        Shape2 shape2=null;
        int i=(int) (4 * random());
        switch (i){
            case 0->shape2=new Rectangle2(10,12);
            case 1->shape2=new Square2(6);
            case 2->shape2=new RightTriangle2(6,8);
            case 3->shape2=new Circle2(10);
        }
        return shape2;
    }

    public void getExtraInformation(Shape2 shape){
        if(shape instanceof Circle2 circle){
            double radius=circle.getRadius();
            System.out.println("Circle radius: "+radius);
        }else if(shape instanceof Square2 square){
            double side=square.getSide();
            System.out.println("Square side length: "+side);
        }
    }
}
