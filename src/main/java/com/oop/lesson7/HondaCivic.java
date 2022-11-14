package com.oop.lesson7;

public class HondaCivic extends Hatchback{
    private Hatchback fourWheels;

    public Hatchback getHatchback() {
        return fourWheels;
    }

    public void setHatchback(Hatchback hatchback) {
        this.fourWheels = hatchback;
    }


    public HondaCivic (Hatchback fourWheels) {
        this.fourWheels = fourWheels;
    }
    @Override
    public void gas() {
        System.out.println("Honda Civic dr" +
                "ives fast");
    }
}
