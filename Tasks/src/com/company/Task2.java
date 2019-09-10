package com.company;

import java.util.Arrays;

public class Task2 {

    public void degrees(int n) {
        int[] numbers = new int[5];
        numbers[0] = 2;
        numbers[1] = 3;
        numbers[2] = 5;
        numbers[3] = 7;
        numbers[4] = 11;
        int[] a = new int[10];
        int k =0;
        for (int i = 0; i < numbers.length; i++) {
            while (n % numbers[i] == 0) {
                n = n /numbers[i];
                a[k] = numbers[i];
                k++;
            }
            if (n == 1) {
                break;
            }
        }

        System.out.println(Arrays.toString(numbers));
    }
}
