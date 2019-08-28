package com.company;

import java.util.*;

public class Calc {


    public static double calculateX(int j) {
        switch (j) {
            case 0:
                return 0;
            case 1:
                return (5.0 / 8);
            default:
                return ((calculateX(j - 1) / 2.0) + 3.0 / 4.0 * calculateX(j - 2));
        }
    }

    public static double calculateSumOfSeries(int limit) {
        double sum = 0;
        for (int i = 0; i < limit; i++) {
            sum += (Math.pow(calculateA(i) - (i / 10.0 - i), 2));
        }
        return sum;
    }

    public static void calcSumABS(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 1; i < arr.size(); i++) {
            for (int j = 0; j < i; j++) {
                sum += Math.abs(arr.get(j));
            }
            System.out.println("Sum first " + i + " elements is: " + sum);
            sum = 0;
        }
    }

    public static void triangle(int a, int b, int c) {
        if (a + b > c && a + c > b && b + c > a) {
            int[] arr = sort(a, b, c);
            if (Math.pow(arr[2], 2) == (Math.pow(arr[1], 2) + Math.pow(arr[0], 2))) {
                System.out.println("Triangle is rectangular");
            }
            if (Math.pow(arr[2], 2) < (Math.pow(arr[1], 2) + Math.pow(arr[0], 2))) {
                System.out.println("Acute triangle");
            }
            if (Math.pow(arr[2], 2) > (Math.pow(arr[1], 2) + Math.pow(arr[0], 2))) {
                System.out.println("Triangle is obtuse");
            }
        } else {
            System.out.println("Incorrect triangle");
        }
    }

    public static void findNumber(List<Integer> arr) {
        Map<Integer, Integer> map = new HashMap<>();
        Map<Integer, Integer> map1 = new HashMap<>();
        for (int i = 0; i < arr.size(); i++) {
            if (!map.containsValue(arr.get(i))) {
                map.put(i, arr.get(i));
            } else {
                map1.put(i, arr.get(i));
            }

        }
        for (Map.Entry entry : map.entrySet()) {
            if (!map1.containsValue(entry.getValue())) {
                System.out.println("Unique number is in position: " + ((Integer) entry.getKey() + 1));
            }
        }
    }

    public static void findBiggestDiv(int a, int b) {
        while (a != 0 && b != 0) {
            if (a >= b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }
        if (a == 0) {
            System.out.println("Biggest div is: " + b);
        } else {
            System.out.println("Biggest div is: " + a);
        }
    }

    public static void calculateCircle(int r, List<Integer> points) {
        int res = 0;

        for (int i = 0; i < points.size(); i++) {
            for (int j = 0; j < points.size(); j++) {
                if ((Math.pow(points.get(i), 2) + Math.pow(points.get(j), 2)) <= Math.pow(r, 2)) {
                    res++;
                }
            }
        }
        System.out.println("There is " + res + " points in circle");
    }

    public static void calculateRating(List<Integer> rating) {
        Collections.sort(rating);
        rating.remove(0);
        rating.remove(rating.size() - 1);
        System.out.println("Average rating is: " + rating.stream().mapToInt(Integer::intValue).sum() / rating.size());
    }

    public static void calculateBuyers(List<Integer> serviceTime, int buyerNumber) {
        int res = 0;
        int fasterServiceTime = Integer.MAX_VALUE;
        if (buyerNumber > serviceTime.size()){
            throw new IllegalArgumentException("There are not that many customers");
        }
        for (int i = 0; i < buyerNumber; i++) {
            res += serviceTime.get(i);
            if (serviceTime.get(i) < fasterServiceTime) {
                fasterServiceTime = serviceTime.get(i);
            }
        }
        System.out.println(res + " minutes");
        System.out.println("Faster service time is " + fasterServiceTime);
    }

    private static double calculateA(int i) {
        if (i % 2 == 0) {
            return i / 2;
        } else {
            return i;
        }
    }

    private static int[] sort(int a, int b, int c) {
        int[] sorted = {a, b, c};
        Arrays.sort(sorted);
        return sorted;
    }
}
