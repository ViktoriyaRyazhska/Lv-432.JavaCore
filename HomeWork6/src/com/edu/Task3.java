package com.edu;

import java.util.*;


public class Task3 {
    public static void main(String[] args) {

        List<Student> sdentiki = new ArrayList<>();
        sdentiki.add(new Student("Donatello",432));
        sdentiki.add(new Student("Rafael",432));
        sdentiki.add(new Student("Micelagelo",454));
        sdentiki.add(new Student("Leonardo",653));
        sdentiki.add(new Student("Splinter",438));
        
        printStudents(sdentiki, 432);
        
        System.out.println("Name sorted: ");
        sdentiki.sort(new Student.NameComparator());
        for(Student stud : sdentiki) {
        	System.out.println(stud);
        }
        
        System.out.println("Course sorted: ");
        sdentiki.sort(new Student.TabComparator());
        for(Student stud : sdentiki) {
        	System.out.println(stud);
        }
        
       

    }

    private static void printStudents(List students, Integer course){
        Iterator iterator = students.iterator();
        while(iterator.hasNext()){
            Student student = (Student)iterator.next();
            if(student.getCourse() == course){
                System.out.println(student);
            }
        }
    }

}
