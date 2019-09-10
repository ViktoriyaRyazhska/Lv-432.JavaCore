package com.company;
/**
 * 5.	Input string and check if this string is palindrome (e.g. “ABCCBA”)
 * @author 999
 *
 */

public class Task5 {
	public static boolean isPalindrome(String str) {
	    return str.equals(new StringBuilder(str).reverse().toString());
	}
}
