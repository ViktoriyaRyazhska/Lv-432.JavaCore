package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String sentence;
        StringBuilder str = new StringBuilder();

        System.out.println("Print sentence with 5 words. Split words by space.");
        sentence = br.readLine();
        String[] words = sentence.split(" ");
        getLongestWord(words);
        reverseString(words, str);

        System.out.println("Print sentence with more than one space between words: ");
        sentence = br.readLine();
        System.out.println(sentence.replaceAll("\\s+", " "));

        System.out.println("Print number like xx.xx+ ");
        String pattern = "$%.2f";
        Double d = Double.parseDouble(br.readLine());
        System.out.printf(pattern, d);
    }

    private static void getLongestWord(String[] words) {
        String res = "";
        for (String word : words) {
            if (word.length() > res.length()) {
                res = word;
            }
        }
        System.out.println("Longest word is: " + res + " with " + res.length() + " chars");
    }

    private static void reverseString(String[] words, StringBuilder str) {
        System.out.println(str.append(words[1]).reverse().toString());
    }
}
