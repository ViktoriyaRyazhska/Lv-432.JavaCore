package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Car {
    private String type;
    private int yearOfProduction;
    private int engineCapacity;

    public Car() {
    }

    public Car(String type, int yearOfProduction, int engineCapacity) {
        this.type = type;
        this.yearOfProduction = yearOfProduction;
        this.engineCapacity = engineCapacity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", engineCapacity=" + engineCapacity +
                '}';
    }

    public static List<Car> getCarByYear(Car[] arr, BufferedReader br) throws IOException {
        System.out.println("Print year of production: ");
        List<Car> cars = new ArrayList<>();
        int yearOfProduction = Integer.parseInt(br.readLine());
        for (Car car : arr) {
            if (car.getYearOfProduction() == yearOfProduction) {
                cars.add(car);
            }
        }
        return cars;
    }

    public static Car[] sortByYearOfProduction(Car[] arr) {
        Car tmp;
        boolean needSort;
        for (int i = 0; i < arr.length - 1; i++) {
            needSort = false;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].getYearOfProduction() < arr[j].getYearOfProduction()) {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                    needSort = true;
                }
            }
            if (!needSort) {
                break;
            }
        }
        return arr;
    }
}
