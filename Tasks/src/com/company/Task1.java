package com.company;

public class Task1 {

    public static void main(String[] args) {
        Task1 main = new Task1();
        main.fibonachi();

    }

    public void fibonachi() {
        int a = 1;
        int b = 1;
        System.out.print("Fibonachi is " + a + ", " + b + ", ");
        for (int i = 0; i < 5; i++) {
            System.out.print((a = a + b) + ", " + (b = b + a) + ", ");
            if (i == 4) {
                System.out.print((a = a + b) + ", " + (b = b + a) + ".");

            }

        }


    }
}
