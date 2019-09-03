package com.company;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class File {
    public static void main(String[] args) {
        int numberOfLines;
        String longestLine;
        String name;
        String birthday;
        List<String> list = Arrays.asList("Name: Andry", "BirthdayDate: 12.12.1994", "kuifuyrougiuitoiuhl hlhlhlh", "kgtoglgtoshle");

        writeToFile("file1.txt", list);
        List<String> strings = readFile("file1.txt");

        numberOfLines = strings.size();
        longestLine = Collections.max(strings, Comparator.comparingInt(String::length));

        Optional<String> optionalName = strings.stream()
                .filter(s -> s.contains("Name:")).findFirst();

        Optional<String> optionalBirthday = strings.stream()
                .filter(s -> s.contains("BirthdayDate")).findFirst();

        name = optionalName.orElse("NoName");
        birthday = optionalBirthday.orElse("No BirthdayDate");

        List<String> toWrite = Arrays.asList("Number of Lines: ",String.valueOf(numberOfLines),"Longest line: ",longestLine,name,birthday);
        writeToFile("file2.txt", toWrite);
    }


    private static void writeToFile(String fileName, List<String> text) {
        try (FileWriter fW = new FileWriter(fileName); BufferedWriter bFw = new BufferedWriter(fW)) {
            for (String s : text) {
                bFw.write(s);
                bFw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static List<String> readFile(String fileName) {
        List<String> lines = new ArrayList<>();
        try (FileReader fR = new FileReader(fileName);
             BufferedReader bFr = new BufferedReader(fR)) {
            lines = bFr.lines().collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }
}
