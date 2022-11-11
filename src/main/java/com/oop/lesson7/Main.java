package com.oop.lesson7;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(2.5);
        System.out.println(circle);
        circle.area();
        circle.perimeter();

        Rectangle rectangle = new Rectangle(5, 6);
        System.out.println(rectangle);
        rectangle.area();
        rectangle.perimeter();


        Triangle triangle = new Triangle(5, 9, 3, 1);
        System.out.println(triangle);
        triangle.area();
        triangle.perimeter();

        Mouse mouse = new Mouse();
        mouse.eat();
        Lion lion = new Lion();
        lion.eat();
        Horse horse = new Horse();
        horse.eat();
        Python python = new Python();
        python.eat();

        HondaCivic honda = new HondaCivic((new Hatchback(25)));
        honda.gas();

    }
}
