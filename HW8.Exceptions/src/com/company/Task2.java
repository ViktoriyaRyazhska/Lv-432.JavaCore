package com.company;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        int n = 10;
        int currentBegin = 1;
        int end = 100;
        while (n > 0) {
            System.out.print("Enter number from range (" + currentBegin + "," + end + ") exclusive : ");
            try {
                currentBegin = readNumber(currentBegin, end);
                n--;
            } catch (IncorrectNumberException e) {
                System.out.println("Wrong number.");
            } catch (InputMismatchException e) {
                System.out.println("Something went wrong. Try again");
            }
        }
    }

    private static int readNumber(int start, int end) throws IncorrectNumberException {
        Scanner sc = new Scanner(System.in);
        int input;

        try {
            input = sc.nextInt();
            if (input <= start || input >= end) {
                throw new IncorrectNumberException();
            }
        } catch (InputMismatchException e) {
            sc.nextLine();
            throw e;
        }
        return input;
    }

    private static class IncorrectNumberException extends Exception {
        public IncorrectNumberException(String msg) {
            super(msg);
        }

        public IncorrectNumberException() {
        }
    }
}
