package com.company;

public class Penguin extends NonFlyingBird {

    public Penguin(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    public Penguin() {
    }

    @Override
    public void fly() {
        System.out.println("I'm non flying penguin");
        super.fly();
    }

    @Override
    public String toString() {
        return "Penguin{" +
                "feathers=" + feathers +
                ", layEggs=" + layEggs +
                '}';
    }
}