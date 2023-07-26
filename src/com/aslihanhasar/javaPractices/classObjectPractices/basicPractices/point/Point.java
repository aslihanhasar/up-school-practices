package com.aslihanhasar.javaPractices.classObjectPractices.basicPractices.point;
import static java.lang.Math.*;

public class Point {
    int coordinateX;
    int coordinateY;

    public Point(int coordinateX,int coordinateY){
        this.coordinateX=coordinateX;
        this.coordinateY=coordinateY;
    }

    public int getCoordinateX() {
        return coordinateX;
    }

    public void setCoordinateX(int coordinateX) {
        this.coordinateX = coordinateX;
    }

    public int getCoordinateY() {
        return coordinateY;
    }

    public void setCoordinateY(int coordinateY) {
        this.coordinateY = coordinateY;
    }

    public Point clonePoint(){
        return new Point(coordinateX,coordinateY);
    }

    public void move(char direction,int amount){
        if(direction=='x'){
            coordinateX+=amount;
        } else if (direction=='y') {
            coordinateY+=amount;
        }
    }
    public double calculateDistanceToOrigin(){
        return sqrt(pow(coordinateX,2)+pow(coordinateY,2));
    }

    public double calculateDistanceToPoint(Point point){
        return Math.sqrt(pow((coordinateX-point.coordinateX),2)+pow((coordinateY-point.coordinateY),2));
    }

}
