package com.company.PartOne;

public class NonFlyingBird extends Bird {
    @Override
    public String fly() {
        return "I can’t fly";
    }

    @Override
    public String toString() {
        return "NonFlyingBird{" +
                "feathers='" + feathers + '\'' +
                ", layEgg=" + layEgg +
                "," +
                this.fly() +
                '}';
    }
}
