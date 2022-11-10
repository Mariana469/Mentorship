package com.oop.lesson7;

public class Mouse extends Animal {

    @Override
    public void eat() {
        System.out.println("Mouse eats corn");
    }

    @Override
    public void speak() {
        System.out.println("Mouse says piiii");
    }

    @Override
    public void run() {
        System.out.println("Mouse runs marathon a day");
    }

    @Override
    public void sleep() {
        System.out.println("Mouse sleeps 12 hours a day");
    }
}
