package com.oop.lesson8;

public class Drums extends Instruments implements CanPlaySound{
    @Override
    public void playSound() {
        System.out.println("Bam bam bam");
    }
}
