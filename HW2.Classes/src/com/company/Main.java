package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        Person p1 = new Person();
        Person p2 = new Person();
        Person p3 = new Person();
        Person p4 = new Person();
        Person p5 = new Person();

        p1.input(bf);
        p2.input(bf);
        p3.input(bf);
        p4.input(bf);
        p5.input(bf);

        p1.output();
        p2.output();
        p3.output();
        p4.output();
        p5.output();
    }
}
