package com.company;

public class Chicken extends NonFlyingBird {

    public Chicken(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    public Chicken() {
    }

    @Override
    public void fly() {
        System.out.println("I'm non flying chicken");
        super.fly();
    }

    @Override
    public String toString() {
        return "Chicken{" +
                "feathers=" + feathers +
                ", layEggs=" + layEggs +
                '}';
    }
}