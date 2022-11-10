package com.oop.lesson7;

public class Hatchback extends Car{

    private int speed;

    public Hatchback() {
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public Hatchback (int speed) {
        this.speed = speed;
    }
    @Override
    public void gas() {
        System.out.println("Хетчбек газує");
    }

    @Override
    public void brake() {
        System.out.println("Хетчбек тормозить");
    }
}
