package com.oop.lesson7;

public class Rectangle extends Figure {
    private int rectangleWidth;
    private int rectangleLength;

    public Rectangle(int rectangleWidth, int rectangleLength) {
        this.rectangleWidth = rectangleWidth;
        this.rectangleLength = rectangleLength;
    }

    public int getRectangleWidth() {
        return rectangleWidth;
    }

    public void setRectangleWidth(int rectangleWidth) {
        this.rectangleWidth = rectangleWidth;
    }

    public int getRectangleLength() {
        return rectangleLength;
    }

    public void setRectangleLength(int rectangleLength) {
        this.rectangleLength = rectangleLength;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "rectangleWidth=" + rectangleWidth +
                ", rectangleLength=" + rectangleLength +
                '}';
    }

    public void areaOfRectangle() {
        System.out.println("Area of Rectangle: " + rectangleWidth * rectangleLength);
    }

    public void perimeterOfRectangle() {
        System.out.println("Perimeter of Rectangle: " + (rectangleWidth + rectangleLength) * 2);
    }
}
