package com.edu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;

public class Task2 {
	public static void main(String[] args){
		
		int sum = 10;
        int lowerNumber = 1;
        int bigestNumber = 100;
		while (sum > 0) {
			try {
				lowerNumber = readNumber(lowerNumber, bigestNumber);
				sum--;
			} catch (IOException e) {
				System.out.println("Try again");
			} catch (NumberFormatException e) {
				System.out.println("Incorrect symbol");
			} catch (ArithmeticException e) {
				System.out.println("Try again");
			} catch (InputMismatchException e) {
				System.out.println("Something went wrong. Try again");
			}
		}
    }

	private static int readNumber(int a, int b) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Input integer in range from 1 to 100");
		int glovo = 0;
		try {
			glovo = Integer.parseInt(br.readLine());
		} catch (NumberFormatException e) {
			throw e;
		} catch (IOException e) {
			throw e;
		}
		if (a < glovo && b > glovo) {
			return glovo;
		} else
			throw new ArithmeticException();

	}
}
