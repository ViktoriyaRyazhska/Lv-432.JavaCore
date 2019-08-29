package com.company;

import java.io.BufferedReader;

import static com.company.Util.*;

public class Task4 {

    private static Car[] cars;

    public static void displayCars(BufferedReader bf) {
        cars = new Car[4];
        cars[0] = new Car(1999, 3.0, CarType.COUPE);
        cars[1] = new Car(1998, 2.5, CarType.CROSSOVER);
        cars[2] = new Car(1997, 2.0, CarType.SEDAN);
        cars[3] = new Car(1990, 1.8, CarType.HATCHBACK);

        printCars(cars);

        System.out.print("Enter year of production : ");
        int year = safeParseInt(safeReadLine(bf));

        for (Car car : cars
        ) {
            if (car.getYearOfProduction() == year) {
                System.out.println(car);
            }
        }

        sortCarsByYearAsc();

        System.out.println("Sorted cars :");
        printCars(cars);
    }

    private static void printCars(Car[] cars) {
        for (Car car : cars
        ) {
            if (car != null) {
                System.out.println(car);
            }
        }
    }

    private static void sortCarsByYearAsc() {
        Car tmpCar;
        for (int i = 0; i < cars.length - 1; i++) {
            for (int j = i + 1; j < cars.length; j++) {
                if (cars[i].getYearOfProduction() > cars[j].getYearOfProduction()) {
                    tmpCar = cars[i];
                    cars[i] = cars[j];
                    cars[j] = tmpCar;
                }
            }
        }
    }
}
