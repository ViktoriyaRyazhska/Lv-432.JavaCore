package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            getPerimeterAndArea(br);
            information(br);
        } catch (IOException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void getPerimeterAndArea(BufferedReader br) throws IOException {
        System.out.println("Print radius: ");

        int r = Integer.parseInt(br.readLine());
        if (r <= 0) {
            throw new IllegalArgumentException("Illegal argument");
        }
        System.out.println("Perimeter: " + Math.PI * 2 * r);
        System.out.println("Area: " + Math.PI * Math.pow(r, 2));
    }

    public static void information(BufferedReader br) throws IOException {
        System.out.println("What is your name? ");
        String name = br.readLine();
        System.out.println("Where are you live, " + name + "?");
        String address = br.readLine();

        System.out.println("Your name is " + name + " and you live in " + address);
    }
}
