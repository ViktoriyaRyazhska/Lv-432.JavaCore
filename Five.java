package com.company;

import java.util.Scanner;

public class Five {
    public void start (){
        System.out.println("Enter string...");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        StringBuilder s = new StringBuilder(input);
        if (s.toString().equals(s.reverse().toString())){
            System.out.println("string is palindrome");
        }
        else {
            System.out.println("string is NOT palindrome");
        }
    }
}
