package com.edu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Task1 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Input first double number");
		double first = 0;
		try {
			first = Double.parseDouble(br.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}catch (NumberFormatException e) {
			e.printStackTrace();
		}

		System.out.println("Input second souble number");
		double second = 0;
		try {
			second = Double.parseDouble(br.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}catch (NumberFormatException e) {
			e.printStackTrace();
		}

		Task1 divine = new Task1();
		try {
			double didum = divine.div(first, second);
		} catch (IllegalArgumentException e) {
			System.out.println("Can't div for 0");
		}
		System.out.println();

	}

	public double div(double a, double b) throws IllegalArgumentException {

		if (b == 0) {
			throw new IllegalArgumentException();
		}

		return a / b;
	}
}