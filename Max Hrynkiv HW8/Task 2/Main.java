package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Write text...");
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        input.close();
        text = text.replaceAll("  +", " ");
        System.out.println(text);
    }
}
