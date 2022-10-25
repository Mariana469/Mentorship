package com.oop;

public class Circle {

    private static final String PERIMETER_OF_THE_CIRCLE_IS = "Perimeter of the circle is: ";
    private static final String AREA_OF_THE_CIRCLE_IS = "Area of the circle is: ";

    public static double perimeterOfCircle(double radius) {
        return Math.PI * radius * 2;
    }

    public static double areaOfCircle(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    public static void main(String[] args) {
        System.out.println(PERIMETER_OF_THE_CIRCLE_IS + perimeterOfCircle(5.5));
        System.out.println(AREA_OF_THE_CIRCLE_IS + areaOfCircle(6.3));
    }
}
