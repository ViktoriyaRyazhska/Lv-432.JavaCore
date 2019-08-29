package com.company;

import java.io.BufferedReader;

import static com.company.Util.safeParseInt;
import static com.company.Util.safeReadLine;

public class Task2 {
    public static void enterTenInts(BufferedReader bf) {
        boolean isFirstFivePositive = true;
        int[] input = new int[10];

        for (int i = 0; i < input.length; i++) {
            System.out.print("Enter " + (i + 1) + " element of array = ");
            input[i] = safeParseInt(safeReadLine(bf));
            if (i < 5 && input[i] < 0) {
                isFirstFivePositive = false;
            }
        }

        if (isFirstFivePositive) {
            System.out.println("Sum of first five elements = " + sum(input));
        } else {
            System.out.println("Product of last five elements = " + product(input));
        }
    }

    private static int sum(int[] array) {
        int result = 0;
        for (int i = 0; i < 5; i++) {
            result += array[i];
        }
        return result;
    }

    private static int product(int[] array) {
        int result = 1;
        for (int i = 5; i < 10; i++) {
            result *= array[i];
        }
        return result;
    }


}
