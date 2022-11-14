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

    public void perimeter() {

        System.out.println(Math.PI * radius * 2);
    }

    public void area() {
        System.out.println(Math.PI * Math.pow(radius, 2));
    }
}
