package com.company;

public class Car {
    private String type;
    private int yearOfProd;
    private int engineCapacity;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYearOfProd() {
        return yearOfProd;
    }

    public void setYearOfProd(int yearOfProd) {
        this.yearOfProd = yearOfProd;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public Car(String type, int yearOfProd, int engineCapacity) {
        this.type = type;
        this.yearOfProd = yearOfProd;
        this.engineCapacity = engineCapacity;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", yearOfProd=" + yearOfProd +
                ", engineCapacity=" + engineCapacity +
                '}';
    }
}
