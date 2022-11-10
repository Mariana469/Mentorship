package com.oop.lesson7;

public class Triangle extends Figure {
    private int triangleWidth;
    private int firstSide;
    private int secondSide;
    private int triangleHeight;

    public Triangle(int triangleHeight, int triangleWidth, int firstSide, int secondSide) {
        this.triangleHeight = triangleHeight;
        this.triangleWidth = triangleWidth;
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    public int getTriangleWidth() {
        return triangleWidth;
    }

    public void setTriangleWidth(int triangleWidth) {
        this.triangleWidth = triangleWidth;
    }

    public int getFirstSide() {
        return firstSide;
    }

    public void setFirstSide(int firstSide) {
        this.firstSide = firstSide;
    }

    public int getSecondSide() {
        return secondSide;
    }

    public void setSecondSide(int secondSide) {
        this.secondSide = secondSide;
    }

    public int getTriangleHeight() {
        return triangleHeight;
    }

    public void setTriangleHeight(int triangleHeight) {
        this.triangleHeight = triangleHeight;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "triangleWidth=" + triangleWidth +
                ", firstSide=" + firstSide +
                ", secondSide=" + secondSide +
                ", triangleHeight=" + triangleHeight +
                '}';
    }

    public void areaOfTriangle() {
        System.out.println("Area of triangle: " + ((triangleWidth * triangleHeight) / 2));
    }

    public void perimeterOfTriangle() {
        System.out.println("Perimeter of triangle: " + (firstSide + secondSide + triangleWidth));
    }
}
