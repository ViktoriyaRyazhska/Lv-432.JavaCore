package ua.com.softserve.homework4;

public class Car {

    String name;
    String type;
    int yearOfProduct;
    int engineCapacity;

    public String getType() {
        return type;
    }

    public int getYearOfProduct() {
        return yearOfProduct;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public String getName() { return name;
    }

    @Override
    public String toString() {
        return "Car{" +
                "  name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", yearOfProduct=" + yearOfProduct +
                ", engineCapacity=" + engineCapacity +
                '}';
    }

    public Car(String name, String type, int yearOfProduct, int engineCapacity) {
        this.name = name;
        this.type = type;
        this.yearOfProduct = yearOfProduct;
        this.engineCapacity = engineCapacity;


    }
}
