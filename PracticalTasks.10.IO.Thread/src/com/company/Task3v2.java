package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task3v2 {

    public static void task3v2(String fileName) {

        List<String> lines = new ArrayList<>();

        try (FileReader fr = new FileReader(fileName)) {
            BufferedReader br = new BufferedReader(fr);
            lines.addAll(br.lines().collect(Collectors.toList()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        lines.forEach(s -> System.out.println(s.length()));

        lines.sort(new LengthComparator());

        System.out.println("Shortest line - \"" + lines.get(0) + "\"");
        System.out.println("Longest line - \"" + lines.get(lines.size() - 1) + "\"");

        lines.forEach(s -> {
            if (s.contains("var")) {
                System.out.println(s);
            }
        });

    }

    private static class LengthComparator implements Comparator<String> {

        @Override
        public int compare(String o1, String o2) {
            return o1.length() - o2.length();
        }
    }
}
