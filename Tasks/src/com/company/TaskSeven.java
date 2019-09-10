package com.company;

import java.util.Scanner;

public class TaskSeven {


	public static void divideNumbers() {
		Scanner scanner = new Scanner(System.in);
		int enteredNumber = 0;
		System.out.println("Enter number");
		enteredNumber = scanner.nextInt();
		int sum = 0;

		for (int x = 1; x < enteredNumber + 1; x++) {

			sum += x;

		}
		System.out.println(sum);

	}

}
