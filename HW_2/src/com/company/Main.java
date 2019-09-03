package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Person p1 = new Person("One", "One", 1994);
        Person p2 = new Person("Two", "Two", 1973);
        Person p3 = new Person("Three", "Three", 1786);
        Person p4 = new Person("Four", "Four", 2000);
        Person p5 = new Person();

        System.out.println(p5.outputInformation());
        p5.inputInformation(br);
        System.out.println(p5.outputInformation());
        System.out.println(p4.getAge());
        System.out.println(p3.getAge());
        System.out.println(p3.outputInformation());

        p4.setBirthYear(2001);
        p3.changeName("Threee", "Threee");
        System.out.println(p4.getAge());
        System.out.println(p3.outputInformation());
    }
}
