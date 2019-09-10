package com.company;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
<<<<<<< HEAD
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);


        Task2 task2 = new Task2();
        System.out.println("Input integer number");
        int n = sc.nextInt();
        System.out.println(Arrays.toString(task2.degrees(n)));
    }

    public int[] degrees(int n) {
=======

    public void degrees(int n) {
>>>>>>> 269808dd46307d303ee36f054c10267d573678c6
        int[] numbers = new int[5];
        numbers[0] = 2;
        numbers[1] = 3;
        numbers[2] = 5;
        numbers[3] = 7;
        numbers[4] = 11;
        int[] a = new int[10];
        int k = 0;
        for (int i = 0; i < numbers.length; i++) {
            while (n % numbers[i] == 0) {
                n = n / numbers[i];
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
