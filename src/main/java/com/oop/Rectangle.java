package com.oop;

public class Rectangle {
    private static int width = 9;
    private static int length = 2;

    public static void calculateSquare(){
        System.out.println(width * length);
    }
    public static void calculatePerimeter(){
        System.out.println((width + length) * 2);

    }

    public static void main(String[] args) {
        Rectangle.calculateSquare();
        Rectangle.calculatePerimeter();
    }
}
