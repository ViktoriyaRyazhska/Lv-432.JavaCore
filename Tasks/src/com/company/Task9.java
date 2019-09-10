package com.company;
public class Task9 {


    public static void findOne(int n) {

        int count = 0;
        for (int i = 0; i < n; i++) {
            int number = (int) Math.round(Math.random());

            if (number == 1) {
                count++;
            }


        }
        System.out.println("We have 1 for " + count + " times");
    }
}