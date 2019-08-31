package com.company;

public class Swallow extends FlyingBird {

    public Swallow(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    public Swallow() {
    }

    @Override
    public void fly() {
        System.out.println("I'm flying swallow");
        super.fly();
    }

    @Override
    public String toString() {
        return "Swallow{" +
                "feathers=" + feathers +
                ", layEggs=" + layEggs +
                '}';
    }
}