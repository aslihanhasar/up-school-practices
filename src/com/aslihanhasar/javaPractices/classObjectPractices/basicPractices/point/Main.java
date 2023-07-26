package com.aslihanhasar.javaPractices.classObjectPractices.basicPractices.point;

public class Main {
    public static void main(String[] args) {
        Point point = new Point(6, 8);
        Point point1 = new Point(10, 12);
        System.out.println(point.calculateDistanceToOrigin());
        System.out.println(point.calculateDistanceToPoint(point1));
        Point point2 = point.clonePoint();
        if (point2.coordinateX == point.coordinateX) {
            System.out.println("The same");
        } else {
            System.out.println("different");
        }

        point.setCoordinateX(5);
        point.move('x',4);
        System.out.println(point.getCoordinateX());

    }

}
