package com.company;

import java.util.Set;

public class Methods {
    public static void union (Set s1, Set s2){
        s1.addAll(s2);
        System.out.println("Set1(union): " + s1 + "\n Set2(union): " + s2);
    }

    public static void intersect (Set s1, Set s2){
        s1.retainAll(s2);
        System.out.println("Set1(intersect): " + s1 + "\n Set2(intersect): " + s2);
    }
}
