package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(System.in);

        Task1 main = new Task1();
        main.fibonachi(sc);

    }

    public void fibonachi(Scanner sc) {
        System.out.println("Input integer number");
        int a = sc.nextInt();
        int b = a;
        System.out.print("Fibonachi is " + a + ", " + b + ", ");
        for (int i = 0; i < 5; i++) {
            System.out.print((a = a + b) + ", " + (b = b + a) + ", ");
            if (i == 4) {
                System.out.print((a = a + b) + ", " + (b = b + a) + ".");

            }

        }


    }
}
