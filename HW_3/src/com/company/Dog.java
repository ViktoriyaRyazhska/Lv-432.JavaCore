package com.company;

public class Dog {
    private String name;
    private String breed;
    private int age;

    public Dog() {
    }

    public Dog(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                '}';
    }

    public enum Breed {
        Akita, Boxer, Collie
    }

    public static Dog oldestDog(Dog d1, Dog d2) {
        return d1.getAge() > d2.getAge() ? d1 : d2;
    }

    public static String checkSameName(Dog dog1, Dog dog2) {
        return "Same name of " + dog1.getBreed() + " " + dog1.getName() + " and "
                + dog2.getBreed() + " " + dog2.getName() + " is "
                + (dog1.getName() == dog2.getName());
    }
}
