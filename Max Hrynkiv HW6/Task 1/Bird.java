package com.company;

public abstract class Bird {

    boolean feathers;
    boolean layEggs;

    public Bird(boolean feathers, boolean layEggs) {
        this.feathers = feathers;
        this.layEggs = layEggs;
    }

    public Bird() {
    }

    public abstract void fly();
}
