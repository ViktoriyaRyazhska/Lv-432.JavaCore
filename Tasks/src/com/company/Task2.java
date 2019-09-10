package com.company;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {


        Task2 task2 = new Task2();

        System.out.println(Arrays.toString(task2.degrees(100)));
    }

    public int[] degrees(int n) {
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
        return a;
    }
}
