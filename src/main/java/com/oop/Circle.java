package com.oop;

public class Circle {
    public static double perimeterOfCircle(double radius) {
        return Math.PI * radius * 2;
    }

    public static double areaOfCircle(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    public static void main(String[] args) {
        System.out.println("Perimeter of the circle is: " + perimeterOfCircle(5.5));
        System.out.println("Area of the circle is: " + areaOfCircle(6.3));
    }
}
