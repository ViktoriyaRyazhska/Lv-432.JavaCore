package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

	int month [] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        System.out.println("Enter number of month");

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        for (int i = 0; i < 12; i++){
            if (input == (i+1)){
                System.out.println("In this month " + month[i] + " days.");
            }

        }
    }
}
