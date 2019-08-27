package com.company;

import java.io.BufferedReader;
import java.io.IOException;

class Util {


    static String safeReadLine(BufferedReader bf) {
        String result = "";
        try {
            result = bf.readLine();
        } catch (IOException e) {
            System.out.println("Error encountered getting user input: "
                    + e.getMessage());
            e.printStackTrace();
        }
        return result;
    }

    static int safeParseInt(String s) {
        int i = 0;
        try {
            i = Integer.parseInt(s);
            return i;
        } catch (NumberFormatException e) {
            System.out.println("Error encountered parsing user input: "
                    + e.getMessage());
            System.out.println("Setting user input to 0");
        }
        return i;
    }
}
