package com.company;

import java.util.Scanner;

public class Task10 {


    public static void findOne() {
        System.out.println("Enter number ");
        int randomNumber = new Scanner(System.in).nextInt();
        int count = 0;
        do {
            if (randomNumber % 2 == 0) {
                randomNumber = randomNumber / 2;
                count++;
            } else {
                randomNumber = (randomNumber * 3) + 1;
                count++;
            }
        } while (randomNumber != 1);
        System.out.println(count);
    }
}