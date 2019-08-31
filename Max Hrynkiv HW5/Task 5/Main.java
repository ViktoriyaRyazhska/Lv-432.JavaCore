package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int i = 0;
        Car car;
        int k = 0;

        Car [] cars = new Car [4];
        cars [0] = new Car("Ford", 1987, 2);
        cars [1] = new Car("Lancia", 1999, 3);
        cars [2] = new Car("Peugeot", 1990, 2);
        cars [3] = new Car("Mercedes", 2000, 4);

        System.out.println("Enter year...");

        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        while (i < cars.length){
            if (year == cars[i].getYearOfProd()) {
                System.out.println(cars[i]);
            }
            i++;
        }

        for (int z = 0; z < cars.length; z++){
            for (int x = 0; x < cars.length - 1 - z; x++){
                if (cars[x].getYearOfProd() > cars[x+1].getYearOfProd()){
                    car = cars[x];
                    cars[x] = cars[x+1];
                    cars[x+1] = car;
                }
            }
        }

        while (k < cars.length){
            System.out.println(cars[k].getType() + " " + cars[k].getYearOfProd());
            k++;
        }


    }
}
