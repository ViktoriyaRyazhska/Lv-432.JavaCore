package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        int[] countOfDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Print number of month: ");
        System.out.println("In this month are " + countOfDays[Integer.parseInt(br.readLine()) - 1] + " days");

        int[] arr = {-10, 5, -7, 56, -24, 4, -8, 7, 10, 66};

        System.out.println(magic(arr));
        System.out.println(getPositionOfSecondPositive(arr));
        System.out.println(getMinimumNumber(arr));
        System.out.println(" ");

        System.out.println("Enter number. First negative number will complete the entry ");
        while (true) {
            if (Integer.parseInt(br.readLine()) < 0) {
                break;
            }
        }

        Car[] cars = {
                new Car("One", 2001, 150),
                new Car("Two", 2019, 500),
                new Car("Three", 2008, 264),
                new Car("Four", 2018, 162),
        };

        System.out.println(Car.getCarByYear(cars, br));
        System.out.println(Arrays.asList(Car.sortByYearOfProduction(cars)));
    }

    private static int magic(int[] arr) {
        boolean positive = true;
        int sumOfPositive = 0;
        int productNegative = 0;

        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] < 0) {
                positive = false;
            } else {
                sumOfPositive += arr[i];
            }
        }
        if (positive) {
            return sumOfPositive;
        }

        for (int i = arr.length / 2; i < arr.length; i++) {
            productNegative = productNegative * arr[i];
        }
        return productNegative;
    }

    private static int getPositionOfSecondPositive(int[] arr) {
        int position = -1;
        int positiveCount = 0;

        for (int i : arr) {
            if (positiveCount == 2) {
                break;
            }
            if (i > 0) {
                positiveCount++;
            }
            position++;
        }
        return position;
    }


    private static String getMinimumNumber(int[] arr) {
        int minimumNumber = Integer.MAX_VALUE;
        int position = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minimumNumber) {
                minimumNumber = arr[i];
                position = i;
            }
        }
        return "Minimum number is " + minimumNumber + " in position " + position;
    }
}
