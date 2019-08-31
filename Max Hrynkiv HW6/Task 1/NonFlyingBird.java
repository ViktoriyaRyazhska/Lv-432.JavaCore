package com.company;

public class NonFlyingBird extends Bird {

    public NonFlyingBird(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    public NonFlyingBird() {
    }

    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}