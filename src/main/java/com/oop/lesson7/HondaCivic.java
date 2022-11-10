package com.oop.lesson7;

public class HondaCivic extends Hatchback{
    private Hatchback hatchback;

    public Hatchback getHatchback() {
        return hatchback;
    }

    public void setHatchback(Hatchback hatchback) {
        this.hatchback = hatchback;
    }


    public HondaCivic (Hatchback hatchback) {
        this.hatchback = hatchback;
    }
    @Override
    public void gas() {
        System.out.println("Honda Civic drives fast");
    }
}
