package com.company;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Map<String, String> personMap = new HashMap<>();

        personMap.put("Hrynkiv", "Max");
        personMap.put("Sapko", "Oleh");
        personMap.put("Ivanov", "Ivan");
        personMap.put("Havryliv", "Orest");
        personMap.put("Fedyk", "Max");
        personMap.put("Vilh", "Pavlo");
        personMap.put("Prozor", "Stepan");
        personMap.put("Soyka", "Ihor");
        personMap.put("Kohman", "Petro");
        personMap.put("Podol", "Mykola");

        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            System.out.println("Surname: " + entry.getKey() + ", Name: " + entry.getValue());
        }

        while (personMap.values().remove("Orest")) {
        }

        Set<String> tmp = new HashSet<>();
        tmp.addAll(personMap.values());
        if (personMap.size() > tmp.size()){
            System.out.println("There are at less two persons with same name");
        }
        else System.out.println("There are no persons with same name");
    }
}
