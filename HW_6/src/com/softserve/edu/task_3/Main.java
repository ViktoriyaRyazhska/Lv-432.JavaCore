package com.softserve.edu.task_3;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		List<Student> student = new ArrayList<>();
		student.add(new Student("Oleg", 1));
		student.add(new Student("Olga", 4));
		student.add(new Student("Iryna", 3));
		student.add(new Student("Ivan", 2));
		student.add(new Student("Bogdan", 3));
		for (Student student2 : student) {
			System.out.println(student2);
		}

		student.sort(new Student.NameComparator());
		System.out.println("\nSorted by name ");
		for (Student student2 : student) {
			System.out.println(student2);

		}

		student.sort(new Student.CourseComparator());
		System.out.println("\nSorted by course");
		for (Student student2 : student) {
			System.out.println(student2);

		}

	}

}
