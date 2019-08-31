package com.company;

public class Main {

    public static void main(String[] args) {

        Bird[] birds = {new Eagle(true, true), new Swallow(true, true), new Chicken(true,true), new Penguin(false, true)};

        for (Bird a : birds){
            a.fly();
            System.out.println(a.toString());
        }
    }
}
