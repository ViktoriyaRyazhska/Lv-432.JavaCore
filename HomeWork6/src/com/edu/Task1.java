package com.edu;
import java.util.Set;
import java.util.TreeSet;

public class Task1 {
    public static void main(String[] args) {


        Set<String> set1 = new TreeSet<>();
        set1.add("54");
        set1.add("78");
        Set<String> set2 = new TreeSet<>();
        set2.add("85");
        set2.add("55");

        union(set1,set2);

        intersect(set1,set2);


    }

    private static void union(Set set1,Set set2){
        set1.addAll(set2);
        System.out.println(set1);

    }
    private static void intersect(Set set1,Set set2){
        set1.retainAll(set2);
        System.out.println(set1);}

}
