package com.oop.lesson7;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + this.radius +
                '}';
    }

    public double perimeterOfCircle() {
        return Math.PI * radius * 2;
    }

    public double areaOfCircle() {
        return Math.PI * Math.pow(radius, 2);
    }
}
