package com.company;


import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Set<String> set1 = new HashSet<>();

        set1.add("one");
        set1.add("two");
        set1.add("three");
        set1.add("four");
        set1.add("five");
        set1.add("six");

        System.out.println("Set1: " + set1);

        Set<String> set2 = new HashSet<>();

        set2.add("five");
        set2.add("six");
        set2.add("seven");
        set2.add("eight");
        set2.add("nine");

        System.out.println("Set2: " + set2);

        Methods.union(set1, set2);
        //or
        //Methods.intersect(set1, set2);
    }

}
