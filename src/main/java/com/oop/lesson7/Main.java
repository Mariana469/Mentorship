package com.oop.lesson7;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(2.5);
        System.out.println(circle);
        System.out.println("Area of circle: " + circle.areaOfCircle());
        System.out.println("Perimeter of Circle: " + circle.perimeterOfCircle());

        Rectangle rectangle = new Rectangle(5, 6);
        System.out.println(rectangle);
        rectangle.areaOfRectangle();
        rectangle.perimeterOfRectangle();


        Triangle triangle = new Triangle(5, 9, 3, 1);
        System.out.println(triangle);
        triangle.areaOfTriangle();
        triangle.perimeterOfTriangle();

    }
}
