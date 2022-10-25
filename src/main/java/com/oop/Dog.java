package com.oop;

public class Dog {
    private String breed;

    public static void say() {
        System.out.println("Гав-гав");
    }

    public static boolean isOld(int dogAge) {
        if (dogAge > 5) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isOld(3));
        say();
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
