package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
//        Float f1 = -4.0f;
//        Float f2 = -5.1f;
//        Float f3 = 4.2f;
//        System.out.println(range(f1));
//        System.out.println(range(f2));
//        System.out.println(range(f3));
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        System.out.println("Print first number: ");
//        int one = Integer.parseInt(br.readLine());
//        System.out.println("Print second number: ");
//        int two = Integer.parseInt(br.readLine());
//        System.out.println("Print third number: ");
//        int three = Integer.parseInt(br.readLine());
//        System.out.println("Max number is: " + maxValue(maxValue(one, two), three));
//        System.out.println("Min number is: " + minValue(minValue(one, two), three));
//
//        System.out.println("Print error number: ");
//        System.out.println("Error is: " + HTTPError.getErrorName(Integer.parseInt(br.readLine())));
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();

        dog1.setAge(10);
        dog1.setBreed(Dog.Breed.Akita.toString());
        dog1.setName("Doggy");

        dog2.setAge(9);
        dog2.setBreed(Dog.Breed.Boxer.toString());
        dog2.setName("Bob");

        dog3.setAge(15);
        dog3.setBreed(Dog.Breed.Collie.toString());
        dog3.setName("Bob");

        System.out.println("Oldest dog is: " + Dog.oldestDog(Dog.oldestDog(dog1, dog2), dog3));
        System.out.println(Dog.checkSameName(dog2, dog1));
    }

    public static String range(Float number) {
        if (number >= -5 && number <= 5) {
            return number + " is on range";
        }
        return number + " is not on range";
    }

    public static int maxValue(int one, int two) {
        return one > two ? one : two;
    }

    public static int minValue(int one, int two) {
        return one < two ? one : two;
    }
}
