package com.company;

public class Eagle extends FlyingBird {

    public Eagle(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    public Eagle() {
    }

    @Override
    public void fly() {
        System.out.println("I'm flying eagle");
        super.fly();
    }

    @Override
    public String toString() {
        return "Eagle{" +
                "feathers=" + feathers +
                ", layEggs=" + layEggs +
                '}';
    }
}
