package com.edu;

import java.util.Map;
import java.util.TreeMap;
import java.util.Set;
import java.util.HashSet;

public class Task2 {
    public static void main(String[] args) {


        Map<String, String> personMap = new TreeMap<>();
        personMap.put("1","Maxim");
        personMap.put("2","Dimas");
        personMap.put("3","Asterix");
        personMap.put("4","Maxim");
        personMap.put("5","Konstantin");
        personMap.put("6","Harry");
        personMap.put("7","Frodo");
        personMap.put("8","Dragon");
        personMap.put("9","Lion");
        personMap.put("10","Maxim");
        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        System.out.println(sameName(personMap));
        while (personMap.values().remove("Maxim"));


        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }



    }
    private static boolean sameName(Map<String,String> personMap){
        Set<String> uniqName = new HashSet<>();
        uniqName.addAll(personMap.values());

        return personMap.size() != uniqName.size();


    }
}
