package com.oop;

public class Circle {

    public double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    public double perimeterOfCircle(double radius) {
        return Math.PI * radius * 2;
    }

    public double areaOfCircle(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

}
