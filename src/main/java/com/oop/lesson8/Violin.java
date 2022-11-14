package com.oop.lesson8;

public class Violin extends Instruments implements CanPlaySound{
    @Override
    public void playSound() {
        System.out.println("Playing violin sound");
    }
}
