package com.company;

import java.util.Scanner;

/**
 * 5.	Input string and check if this string is palindrome (e.g. “ABCCBA”)
 * @author 999
 *
 */

public class Task5 {
	public static boolean isPalindrome() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string");
		String str = sc.nextLine();
	    return str.equals(new StringBuilder(str).reverse().toString());
	}
}
