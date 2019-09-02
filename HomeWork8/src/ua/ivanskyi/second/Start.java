package ua.ivanskyi.second;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Start {

	static void readNumber() {

	}

	public static void main(String[] args) {

		int amount = 10;
		int begin = 1;
		int end = 100;

		while (amount > 0) {
			System.out.println("Enter number from range (" + begin + " - " + end + " )");

			try {
				begin = Start.readNumber(begin, end);
				amount--;
			} catch (WrongNumberException e) {
				System.out.println("Enter correct number");

			} catch (InputMismatchException e) {
				System.out.println("You didnt enter number");

			}
		}
	}

	static int readNumber(int start, int end) throws WrongNumberException {
		Scanner sc = new Scanner(System.in);

		int inputNumber = 0;

		try {
			inputNumber = sc.nextInt();
			if (inputNumber <= start || inputNumber >= end) {
				throw new WrongNumberException();
			}

		} catch (InputMismatchException e) {

			throw e;
		}

		return inputNumber;

	}

	private static class WrongNumberException extends Exception {

		public WrongNumberException() {
			super();

		}

		public WrongNumberException(String message) {
			super(message);

		}

	}

}
