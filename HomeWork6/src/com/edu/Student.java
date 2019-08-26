package com.edu;

import java.util.Comparator;


public class Student{
	
	public static class NameComparator implements Comparator<Student> {
		public int compare(Student o1, Student o2) {
			return o1.getName().compareTo(o2.getName());
		}
	}

	public static class TabComparator implements Comparator<Student> {
		public int compare(Student o1, Student o2) {
			return o1.getCourse() - o2.getCourse();
		}
	}
	
	private static NameComparator nameComparator = new NameComparator();
	private static TabComparator tabComparator = new TabComparator();
	
	
	
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
    
    public static Comparator<Student> getNameComparator() {
		return nameComparator;
	}

	public static Comparator<Student> getTabComparator() {
		return tabComparator;
		}
		
    @Override
    public String toString() {
        return "student " + getName() + " course " + getCourse() ;
    }
    
   
}
