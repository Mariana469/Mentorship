package com.oop;

public class Main {
    public static void main(String[] args) {
        Point firstPoint = new Point(1, 6);
        Point secondPoint = new Point(10, 30);
        Point thirdPoint = new Point(20, 30);
        Point fourthPoint = new Point(20, 30);
        Line l1 = new Line(firstPoint, secondPoint);
        Line l2 = new Line(thirdPoint, fourthPoint);
        System.out.println("p1.distance(p2) = " + firstPoint.distance(secondPoint));
        l1.isParallel(l2);

        Circle circle = new Circle(2.5);
        System.out.println(circle.perimeterOfCircle(2.5));
        System.out.println(circle.areaOfCircle(2.5));

        Dog dog = new Dog();
        System.out.println(dog.isOld(3));
        dog.say();

        Rectangle rectangle = new Rectangle(2, 3);
        rectangle.calculatePerimeter();
        rectangle.calculateSquare();

    }
}
