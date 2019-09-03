package com.company.PartOne;

public class Main {

    public static void main(String[] args) {
        Bird[] birds = {
                new Chicken(),
                new Eagle(),
                new Penguin(),
                new Swallow()
        };
        birds[0].feathers = "One";
        birds[1].feathers = "Two";
        birds[2].feathers = "Three";
        birds[3].feathers = "Four";

        for (Bird bird : birds) {
            System.out.println(bird.toString());
        }
    }
}
