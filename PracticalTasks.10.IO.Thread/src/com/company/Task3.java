package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Task3 {

    public static void task3(String fileName) {
        String line = null;
        String[] lines = readFileToArrayOfStrings(fileName);

        int maxLength = Integer.MIN_VALUE;
        int maxPos = 0;
        int minLength = Integer.MAX_VALUE;
        int minPos = 0;
        for (int i = 0; i < lines.length; i++) {
            System.out.println("line [" + i + "].length = " + lines[i].length());

            if (lines[i].length() > maxLength) {
                maxLength = lines[i].length();
                maxPos = i;
            } else if (lines[i].length() < minLength) {
                minLength = lines[i].length();
                minPos = i;
            }
        }

        System.out.println("Shortest line - " + minPos + " : \"" + lines[minPos] + "\"");
        System.out.println("Longest line - " + maxPos + " :\"" + lines[maxPos] + "\"");

        printLineWhichConsistOfWord(lines, "var");
    }

    private static void printLineWhichConsistOfWord(String[] lines, String word) {
        for (String line : lines
        ) {
            if (line.contains(word)) {
                System.out.println(line);
            }
        }
    }

    private static int getNumberOfLines(String fileName) {
        int numberOfLines = 0;
        try (FileReader fr = new FileReader(fileName);
             BufferedReader bf = new BufferedReader(fr)) {
            while (bf.readLine() != null) {
                numberOfLines++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return numberOfLines;
    }

    private static String[] readFileToArrayOfStrings(String fileName) {
        String[] lines = new String[getNumberOfLines(fileName)];

        try (FileReader fr = new FileReader(fileName);
             BufferedReader bf = new BufferedReader(fr)) {
            for (int i = 0; i < lines.length; i++) {
                lines[i] = bf.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }

}
