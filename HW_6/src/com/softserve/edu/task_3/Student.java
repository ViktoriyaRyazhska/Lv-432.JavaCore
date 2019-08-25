package com.softserve.edu.task_3;

import java.util.*;

public class Student {
	private String name;
	private int course;

	public Student(String name, int course) {
		this.name = name;
		this.course = course;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCourse() {
		return course;
	}

	public void setCourse(int course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student name " + name + ", course " + course;
	}

	public static void printStudents(List<Student> students, Integer course) {
		Iterator iterator = students.iterator();
		while (iterator.hasNext()) {
			Student s = (Student) iterator.next();
			if (s.getCourse() == course) {
				System.out.println(s.getName());
			}
		}
	}

	static class NameComparator implements Comparator<Student> {

		@Override
		public int compare(Student n1, Student n2) {
			return n1.getName().compareTo(n2.getName());
		}
	}

	static class CourseComparator implements Comparator<Student> {

		@Override
		public int compare(Student c1, Student c2) {
			return c1.getCourse() - c2.getCourse();
		}

	}
}
