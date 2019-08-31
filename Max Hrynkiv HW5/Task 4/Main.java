package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int n = 0;
        int product = 1;



        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++){
            System.out.println("Please enter number");
            n = Integer.parseInt(sc.nextLine());
            product *= n;
            if (n < 0){
                break;
            }
        }
        sc.close();
        System.out.println("Product = " + (product/n));

    }
}
