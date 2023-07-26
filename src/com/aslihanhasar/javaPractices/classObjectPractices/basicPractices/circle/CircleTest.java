package com.aslihanhasar.javaPractices.classObjectPractices.basicPractices.circle;

import java.util.Scanner;

public class CircleTest {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

       /* Circle circleOne=new Circle();
        System.out.print("Enter the radius of circle: ");
        circleOne.radius=scanner.nextInt();
        System.out.println("Area of the circle: "+circleOne.calculateArea(circleOne.radius));
        System.out.println("Perimeter of the circle: "+circleOne.calculatePerimeter(circleOne.radius));*/

        Circle circleTwo=new Circle();
        System.out.println(circleTwo.calculateArea(circleTwo.radius));
        System.out.println(circleTwo.calculatePerimeter(circleTwo.radius));
        circleTwo.radius=5;
        System.out.println(circleTwo.calculateArea(circleTwo.radius));
        System.out.println(circleTwo.calculatePerimeter(circleTwo.radius));

        Circle circleThree=new Circle(5);
        System.out.println(circleTwo.calculatePerimeter(circleThree.radius));

    }
}
