package com.company;

import java.util.Random;
import java.util.Scanner;

public class Nine {
    public static void Calculate(Scanner sc) {
        System.out.println("Print count of random generating: ");
        int count = Integer.parseInt(sc.nextLine());
        int res = 0;
        Random r = new Random();

        for (int i = 0; i < count; i++) {
            if (r.nextInt(2) == 1) {
                res++;
            }
        }
        System.out.println(res);
    }
}
