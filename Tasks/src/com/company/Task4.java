package com.company;

import java.util.Scanner;

public class Task4 {
    public void execute() {
        Scanner stdin = new Scanner(System.in);
        String string;
        System.out.println("Enter a string");
        string = stdin.nextLine();
        System.out.println("Number of loud letters: " + (string.length() - string.toLowerCase().replaceAll("a|e|i|o|u|", "").length()));
    }

}

