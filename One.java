package com.softserve.edu.task1;

import java.util.Scanner;

public class One {

	public static void fibonacchi(Scanner sc) {
		int n0 = 1;
		int n1 = 1;
		int n2 = n0 + n1;

		System.out.println("Enter number ");
		int n = sc.nextInt();
		if (n <= 1) {

			System.out.println("n<0");
		}
		System.out.print(n0 + " " + n1 + " ");
		for (int i = 3; i <= n; i++) {
			n2 = n0 + n1;
			System.out.print(n2 + " ");
			n0 = n1;
			n1 = n2;
		}

	}}
