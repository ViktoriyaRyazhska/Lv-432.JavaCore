package com.softserve.edu.task1;

import java.util.Scanner;

public class Two {
	public static void product(Scanner sc) {

		System.out.println("Enter number ");
		int number = sc.nextInt();
		for (int i = 2; i <= number; i++) {
			for (int j = 2; j <= i; j++) {
				if (number % j == 0) {
					System.out.print(j + " ");
					number = number / j;
				}
			}
	
	}
}}
