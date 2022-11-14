package com.oop.lesson8;

public class Piano extends Instruments implements CanPlaySound{
    @Override
    public void playSound() {
        System.out.println("Playing piano sound");
    }
}
