package ua.com.softserve.homework7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a sentence that contains the words between more than one space:");
        String word = br.readLine();

        String replaceString = word.replaceAll("[\\s]{2,}", " ").trim();
        System.out.println(replaceString);
    }
}
