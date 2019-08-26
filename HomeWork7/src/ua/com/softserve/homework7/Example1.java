package ua.com.softserve.homework7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example1 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter five words:");
        String str = br.readLine();
        String[] chAr = str.split(" ");
        String ch1 = longest(chAr);
        System.out.println("The longest word is : " + ch1);
        System.out.println("Number of letters in a word  = " + ch1.length());
        System.out.println("The second word in reverse order : " + "'" + reverse(chAr[1]) + "'");
    }

    private static String reverse(String word) {
        String reverse = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reverse = reverse + word.charAt(i);
        }
        return reverse;
    }

    private static String longest(String[] chAr) {

        String ch1 = chAr[0];
        for (int i = 1; i < chAr.length; i++) {
            if (ch1.length() < chAr[i].length())
                ch1 = chAr[i];
        }
        return ch1;
    }
}

