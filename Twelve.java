package com.company;

public class Twelve {
    public static void Calculate() {
        int res = 0;
        for (int i = 3; i <= 1000; i++) {
            if ((i % 3 == 0) || (i % 5 == 0)) {
                res += i;
            }
        }
        System.out.println("Sum of all the multiples of 3 or 5 below 1000 is: " + res);
    }
}
