package ua.com.softserve.homework4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

        Car[] arrayCars = new Car[]{
                new Car("Renault", "Universal", 2013, 110),
                new Car("Audi", "Coupe", 2002, 250),
                new Car("Dodge", "Pickup", 2006, 200),
                new Car("BMW", "Sedan", 2010, 150),
        };

        int carYear = getCarYear();
        findByYear(arrayCars, carYear);
        sortByYear(arrayCars);
        printCarInfo(arrayCars);
    }

    private static int getCarYear() throws IOException {
        System.out.println("Enter the year the of car (2002/2006/2010/2013) : ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return Integer.parseInt(br.readLine());
    }

    private static void printCarInfo(Car[] arrayCars) {
        for (int i = 0; i < arrayCars.length; i++) {
            System.out.println((i + 1) + ".  " + arrayCars[i].name + "  " + arrayCars[i].yearOfProduct + "  ");
        }
    }

    private static void sortByYear(Car[] arrayCars) {
        Car tmp;
        boolean isStop = true;
        for (int i = 0; i < arrayCars.length; i++) {
            isStop = true;
            for (int j = 0; j < arrayCars.length - 1 - i; j++) {
                if (arrayCars[j].getYearOfProduct() > arrayCars[j + 1].getYearOfProduct()) {
                    tmp = arrayCars[j];
                    arrayCars[j] = arrayCars[j + 1];
                    arrayCars[j + 1] = tmp;
                    isStop = false;
                }
            }
            if (isStop) {
                break;
            }
        }
        System.out.println("Sorted by the field year: ");
    }

    private static void findByYear(Car[] arrayCars, int carYear) {
        boolean missingCar = true;

        for (Car car : arrayCars) {
            if (car.yearOfProduct == carYear) {
                missingCar = false;
                System.out.println(car);
            }
        }
        if (missingCar) {
            System.out.println("There is no car with such a year of production!!!");
        }
    }
}
