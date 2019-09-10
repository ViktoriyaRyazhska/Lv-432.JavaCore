package com.company;

import java.util.Scanner;

public class TaskSeven {

	public static int qestion() {
		int enteredNumber = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter quantity of fibonachi");
		enteredNumber = scanner.nextInt();
		scanner.close();
		return enteredNumber;
	}

	public static void divideNumbers(Scanner scanner) {
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
