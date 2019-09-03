package com.company.PartOne;

public class FlyingBird extends Bird {
    @Override
    public String fly() {
        return " I can fly";
    }

    @Override
    public String toString() {
        return "FlyingBird{" +
                "feathers='" + feathers + '\'' +
                ", layEgg=" + layEgg +
                "," +
                this.fly() +
                '}';
    }
}
