package com.oop;

public class Rectangle {
    public int width;

    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }

    public int length;

    public void calculateSquare() {
        System.out.println(width * length);
    }

    public void calculatePerimeter() {
        System.out.println((width + length) * 2);

    }
}
