package com.softserve.edu.task_1;

public class Sentence {

	public static void main(String[] args) {
		String sentence = "Summer is ending very quickly";

		// display the longest word in the sentence
		// determine the number of its letters
		String[] s = sentence.split(" ");
		String maxLength = "";
		for (int i = 0; i < s.length; i++) {
			if (s[i].length() > maxLength.length()) {
				maxLength = s[i];
			}

		}
		System.out.println("The longest word " + maxLength + " has " + maxLength.length() + " letters");

		// bring the second word in reverse order

		for (String string : sentence.split(" ")) {
			if (string.length() == 2) {
				System.out.println(new StringBuilder(string).reverse().toString());
			}
		}

	}

}
