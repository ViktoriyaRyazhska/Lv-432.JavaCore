package com.company;

public class FlyingBird extends Bird {

    public FlyingBird(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    public FlyingBird() {
    }

    @Override
    public void fly() {
        System.out.println("I can fly");
    }
}
