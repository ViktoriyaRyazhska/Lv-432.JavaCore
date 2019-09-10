package com.company;

import java.util.Scanner;

public class TaskEight {

	private static String[] special = { "", "thousand", "million", "billion", "trillion", "quadrilion", "qikljl"

	};
	private static String[] tens = { "", "ten", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty",
			"ninety"

	};

	private static String[] num = { "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
			"eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eightteen", "nineteen"

	};

	public static String isPalindrome(int number) {

		String current;
		if (number % 100 < 20) {
			current = num[number % 100];
			number /= 100;
		} else {
			current = num[number % 10];
			number /= 10;

			current = tens[number % 10] + current;
			number /= 10;
		}
		if (number == 0) {
			return current;
		}
		return num[number] + "hundred" + current;
	}

	public static String convert() {
		Scanner sc = new Scanner(System.in);
		int number = 0;
		System.out.println("Enter number");
		number = sc.nextInt();

		if (number == 0) {
			return "zero";
		}

		String current = "";
		int place = 0;

		do {
			int n = number % 1000;
			if (n != 0) {
				String s = isPalindrome(n);
				current = s + special[place] + current;
			}
			place++;
			number /= 1000;
		} while (number > 0);

		return (current).trim();

	}

}
