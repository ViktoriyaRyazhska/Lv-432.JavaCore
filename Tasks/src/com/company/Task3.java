package com.company;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter coast of dollar:");
        float getCoastOfDollar = scanner.nextFloat();
        System.out.println("Enter sum of grn:");
        float getSumOfGrn = scanner.nextFloat();

        System.out.println("Count of dollar is: " + (getSumOfGrn/getCoastOfDollar));

    }

}