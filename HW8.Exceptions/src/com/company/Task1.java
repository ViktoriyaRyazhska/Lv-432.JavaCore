package com.company;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        double a, b, result;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two numbers");
        a = readDouble(scanner, "a");
        while (true) {
            b = readDouble(scanner, "b");
            try {
                result = div(a, b);
                break;
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
                System.out.println("Try again");
            }
        }
        scanner.close();
        System.out.print("Result : ");
        System.out.printf("%.2f", result);
    }

    private static double readDouble(Scanner scanner, String numberName) {
        double n = 0;
        while (true) {
            try {
                System.out.print("Enter " + numberName + ": ");
                n = scanner.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Wrong input. Try again");
                scanner.nextLine();
            } catch (NoSuchElementException | IllegalStateException e) {
                System.out.println("Something went wrong. Try again");
                scanner.nextLine();
            }
        }
        return n;
    }

    private static double div(double a, double b) throws ArithmeticException {
        if (b == 0.0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }
}
