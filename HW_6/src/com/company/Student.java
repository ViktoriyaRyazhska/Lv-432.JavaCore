package com.company;

import java.util.Comparator;
import java.util.List;

public class Student {

    private static class NameComparator implements Comparator<Student> {
        public int compare(Student o1, Student o2) {
            return o1.getName().compareTo(o2.getName());
        }
    }

    private static class CourseComparator implements Comparator<Student> {
        public int compare(Student o1, Student o2) {
            return o1.getCourse() - o2.getCourse();
        }
    }


    private String name;
    private int course;
    private static NameComparator nameComparator = new NameComparator();
    private static CourseComparator courseComparator = new CourseComparator();


    public Student() {
    }

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

    public static NameComparator getNameComparator() {
        return nameComparator;
    }

    public static CourseComparator getCourseComparator() {
        return courseComparator;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    public static void printStudents(List<Student> list, Integer course) {
        for (Student next : list) {
            if (course.equals(next.getCourse())) {
                System.out.println(next);
            }
        }
    }
}
