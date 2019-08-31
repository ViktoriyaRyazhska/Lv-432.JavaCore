package com.company;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Student> students = new LinkedList<>();

        students.add(new Student("Petya", 2));
        students.add(new Student("Vova", 1));
        students.add(new Student("Andrew", 4));
        students.add(new Student("Max", 4));
        students.add(new Student("Oleh", 3));

        students.sort(Student.getNameComparator());

        System.out.println("Sorted by name:");

        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println("Sorted by course:");

        students.sort(Student.getCourseComparator());

        for (Student student : students) {
            System.out.println(student);
        }


        System.out.println("\n");
        Student.printStudents(students, 4);
    }
}
