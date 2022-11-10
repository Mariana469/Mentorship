package com.oop.lesson7;

public class Lion extends Animal {
    @Override
    public void eat() {
        System.out.println("Lion eats meat");
    }

    @Override
    public void speak() {
        System.out.println("Lion says arrr");
    }

    @Override
    public void run() {
        System.out.println("Lion runs ten miles a day");
    }

    @Override
    public void sleep() {
        System.out.println("Lion sleeps 10 hours a day");
    }

}
