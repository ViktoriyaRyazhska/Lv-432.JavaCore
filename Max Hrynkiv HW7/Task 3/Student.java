package com.company;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Student {

    public static class NameComparator implements Comparator<Student>{
        public int compare (Student s1, Student s2){
            return s1.getName().compareTo(s2.getName());
        }
    }

    public static class CourseComparator implements Comparator<Student>{
        public int compare (Student s1, Student s2){
            return s1.getCourse() - (s2.getCourse());
        }
    }

    //-------------------------


    private static NameComparator nameComparator = new NameComparator();
    private static CourseComparator courseComparator = new CourseComparator();

    private String name;
    private int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public static NameComparator getNameComparator() {
        return nameComparator;
    }

    public static CourseComparator getCourseComparator() {
        return courseComparator;
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    public static void printStudents (List students, Integer course){
            Iterator iterator = students.iterator();
            while(iterator.hasNext()){
                Student student = (Student) iterator.next();
                if(student.getCourse() == course){
                    System.out.println(student);
                }
            }
    }
}
