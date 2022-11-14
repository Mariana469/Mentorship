package com.oop;

public class Dog {
    private String breed;

    public void say() {
        System.out.println("Гав-гав");
    }

    public boolean isOld(int dogAge) {
        if (dogAge > 5) {
            return true;
        } else {
            return false;
        }
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
