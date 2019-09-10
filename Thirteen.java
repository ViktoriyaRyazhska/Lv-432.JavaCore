package com.company;

public class Thirteen {

    public static void Calculate() {
        int number = 20;
        boolean finish = true;
        while (true) {
            for (int i = 1; i < 21; i++) {
                finish = true;
                if (number % i != 0) {
                    finish = false;
                    break;
                }
            }
            if (finish) {
                System.out.println("The smallest number is: " + number);
                break;
            }
            number++;
        }
    }
}
