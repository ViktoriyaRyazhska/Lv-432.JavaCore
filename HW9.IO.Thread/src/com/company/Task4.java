package com.company;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Task4 {
    private static final String readFileName = "file1.txt";
    private static final String writeFileName = "file2.txt";

    private static List<String> lines;

    public static void main(String[] args) {
        int numberOfLines;
        String longestLine;
        String name;
        String birthday;

        Task4.lines = readFileToList(readFileName);
        numberOfLines = lines.size();

        longestLine = Collections.max(lines, Comparator.comparingInt(String::length));

        Optional<String> maybeName = lines.stream()
                .filter(s -> s.contains("[name:"))
                .findFirst();

        Optional<String> maybeDate = lines.stream()
                .filter(s -> s.contains("[birthday:"))
                .findFirst();

        name = maybeName.orElse("");
        birthday = maybeDate.orElse("");


        writeToFile(writeFileName, String.valueOf(numberOfLines), longestLine, name, birthday);

    }

    private static List<String> readFileToList(String readFileName) {
        List<String> lines = new ArrayList<>();
        try (FileReader fr = new FileReader(readFileName);
             BufferedReader bf = new BufferedReader(fr)) {
            lines = bf.lines().collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }

    private static void writeToFile(String writeFileName, String... stuff) {
        try (FileWriter fw = new FileWriter(writeFileName);
             BufferedWriter bw = new BufferedWriter(fw)) {
            for (String thing : stuff
            ) {
                bw.write(thing);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
