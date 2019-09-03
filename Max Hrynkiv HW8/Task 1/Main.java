package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int longest = 0;

        System.out.println("Enter words...");

        Scanner input = new Scanner(System.in);

        String [] text = input.nextLine().split(" ");

        input.close();

        String longestStr = text[0];

        for (int i =0; i < text.length; i++){
            if (text[i].length() > longest){
                longest = text[i].length();
                longestStr = text[i];
            }
        }

        StringBuilder strb = new StringBuilder(text[1]);
        System.out.println("Longest word is " + longestStr + ". It has " + longest + " letters. Reversed word is " + strb.reverse() + ".");
    }
}
