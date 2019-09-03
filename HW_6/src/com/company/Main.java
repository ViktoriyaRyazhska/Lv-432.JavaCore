package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);

        set2.add(4);
        set2.add(5);
        set2.add(6);
        set2.add(7);

        System.out.println(union(set1, set2));
        System.out.println(intersection(set1, set2));

//___________________________________________________________________________________________________________
        Map<String, String> personMap = new HashMap<>();

        personMap.put("FirstName1", "LastName1");
        personMap.put("FirstName2", "LastName4");
        personMap.put("FirstName3", "LastName3");
        personMap.put("FirstName4", "LastName4");
        personMap.put("FirstName6", "LastName5");
        personMap.put("FirstName7", "LastName6");
        personMap.put("FirstName8", "LastName5");
        personMap.put("FirstName9", "LastName5");
        personMap.put("FirstName10", "LastName8");
        findSameName(personMap);
        System.out.println(personMap);

        System.out.println("Print last name to delete: ");
        String lastNameToRemove = br.readLine();
        while (personMap.values().remove(lastNameToRemove));
        System.out.println(personMap);
        //__________________________________________________________________________________________________________

        List<Student> list = new ArrayList<>();

        list.add(new Student("One", 1));
        list.add(new Student("Two", 5));
        list.add(new Student("Three", 4));
        list.add(new Student("Five", 2));
        list.add(new Student("Six", 2));

        System.out.println("Print student’s course: ");
        Student.printStudents(list, Integer.parseInt(br.readLine()));

        list.sort(Student.getCourseComparator());
        System.out.println("Sorted by course: " + list);

        list.sort(Student.getNameComparator());
        System.out.println("Sorted by name: " + list);
    }


    private static Set<Integer> union(Set<Integer> set1, Set<Integer> set2) {
        set1.addAll(set2);
        return set1;
    }

    private static Set<Integer> intersection(Set<Integer> set1, Set<Integer> set2) {
        set1.retainAll(set2);
        return set1;
    }

    private static void findSameName(Map<String, String> map) {
        Set<String> uniqueVal = new HashSet<>(map.values());
        if (map.size() - uniqueVal.size() > 2) {
            System.out.println("There is at least two people with the same last name");
        } else {
            System.out.println("All people last name are unique");
        }
    }
}
