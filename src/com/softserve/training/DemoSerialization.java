package com.softserve.training;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable {
	private static final long serialVersionUID = 1L;
	protected static String bachelor;
	private int id;
	private String name;
	private transient String password;

	public Student(String bachelor, int id, String name, String password) {
		Student.bachelor = bachelor;
		this.id = id;
		this.name = name;
		this.password = password;
	}

	public String toString() {
		return "Fac: " + bachelor + ", name: " + name + ", pas: " + password;
	}
}

public class DemoSerialization {
	public static void main(String[] args) {
		//Student student = new Student("ComputerScience", 1, "Ivanov", "12345");
		//System.out.println(student);
		//
		// save object in file
		/*
		File fw = new File("d:/demo.cer");
		try {
			ObjectOutputStream ostream = new ObjectOutputStream(new FileOutputStream(fw));
			ostream.writeObject(student);
			ostream.close();
		} catch (IOException e) {
			System.err.println(e);
		}
		*/
		//
		// change value of static field
		//Student.bachelor = "Mathematic";
		File fr = new File("d:/demo.cer");
		try {
			ObjectInputStream istream = new ObjectInputStream(new FileInputStream(fr));
			Student unknown = (Student) istream.readObject();
			istream.close();
			System.out.println(unknown);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
}
