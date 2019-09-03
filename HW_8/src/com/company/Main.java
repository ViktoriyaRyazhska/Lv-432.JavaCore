package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Double one, two;


        try {
            System.out.println("Print first double number: ");
            one = Double.parseDouble(br.readLine());
            System.out.println("Print second double number: ");
            two = Double.parseDouble(br.readLine());
            div(one, two);
        } catch (ArithmeticException | IOException e) {
            System.out.println(e.getMessage());
        }

        try {
            readNumber(0, 20, 1, br);
        } catch (IllegalArgumentException | IOException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("10 numbers.");

        try {
            readNumber(1, 100, 10, br);
        } catch (IllegalArgumentException | IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void div(Double one, Double two) {
        if (one <= 0 || two <= 0) {
            throw new ArithmeticException("Cant divide by zero");
        }
        System.out.println(one / two);
    }

    public static void readNumber(int start, int end, int count, BufferedReader br) throws IOException {
        int tmp = 0;
        for (int j = 0; j < count; j++) {
            System.out.println("Write number: " + (j + 1));
            int i = Integer.parseInt(br.readLine());
            if (!(i <= end && i >= start) || (i <= tmp)) {
                throw new IllegalArgumentException("Invalid number");
            }
            tmp = i;
        }
        System.out.println("Everything is ok");
    }
}
