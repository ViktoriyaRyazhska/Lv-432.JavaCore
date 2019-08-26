package com.softserve.edu.task_2;

public class SentenceSpace {

	public static void main(String[] args) {
		String s = "I    am      learning     Java   Core";
		String s1 = s.replaceAll("\\s+", " ");
		String newSentence = s1.replaceAll("I am", "I'm");
		System.out.println(newSentence);

	}

}
