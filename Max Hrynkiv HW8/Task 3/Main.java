package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        System.out.println("Write data...");

        String pattern = "\\$(\\d*)(\\.\\d{2})?";

        Scanner input = new Scanner(System.in);

        String text = input.nextLine();
        input.close();

        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);

        if (m.matches()){
            System.out.println("text correspond pattern");
        }
        else{
            System.out.println("text NOT correspond pattern");
        }
        m.reset();
    }
}
