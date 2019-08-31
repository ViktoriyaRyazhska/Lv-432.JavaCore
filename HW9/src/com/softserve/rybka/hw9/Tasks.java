package com.softserve.rybka.hw9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tasks {
    public static void main(String[] args) {
        new Task1();
        //new Task2();
        new Task3();
        new Task4();
    }
}

class Task1 {
    Task1() {
        Runnable runnable = new MyRunnable();
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        Thread thread3 = new Thread(runnable);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        thread3.start();
    }
}

class Task2 {
    private final static Object first = new Object();
    private final static Object second = new Object();

    Task2() {
        Thread t1 = new Thread(() -> {
            synchronized (first) {
                System.out.println(Thread.currentThread().getName() + " is alive");
                Thread.yield();
                synchronized (second) {
                    System.out.println("Success!!!!!");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (second) {
                System.out.println(Thread.currentThread().getName() + " is alive");
                Thread.yield();
                System.exit(1);
                synchronized (first) {
                    System.out.println("Success!");
                }
            }
        });
        t1.start();
        t2.start();
    }
}

class Task3 {
    Task3() {
        Thread t1;
        Thread t2;
        Thread t3;

        t3 = new Thread(() -> {
            Thread.currentThread().setName("three");
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread number " + Thread.currentThread().getName());
            }
        });

        t2 = new Thread(() -> {
            Thread.currentThread().setName("two");
            for (int i = 0; i < 3; i++) {
                System.out.println("Thread number " + Thread.currentThread().getName());
            }
            t3.start();
        });

        t1 = new Thread(() -> {
            Thread.currentThread().setName("one");
            System.out.println("Thread number " + Thread.currentThread().getName());
            t2.start();
        });

        t1.start();
    }
}

class Task4 {

    Task4() {
        List<String> t = readFile();
        numberLines(t);
        longestLine(t);
        findNameDate(t);
    }

    private List<String> readFile() {
        FileReader fileReader;
        BufferedReader reader;
        List<String> text = new ArrayList<>();

        try {
            String fileName = "D:\\ideaproj\\HW9\\src\\com\\softserve\\rybka\\hw9\\file1.txt";
            fileReader = new FileReader(fileName);
            reader = new BufferedReader(fileReader);
            String line;
            System.out.println("Reading data to file: " + fileName);
            while ((line = reader.readLine()) != null) {
                text.add(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return text;
    }

    private void writeFile(String... data) {
        String fileName = "D:\\ideaproj\\HW9\\src\\com\\softserve\\rybka\\hw9\\file2.txt";
        FileWriter fw;
        BufferedWriter bw;
        try {
            fw = new FileWriter(fileName, true);
            bw = new BufferedWriter(fw);
            System.out.println("Writing data to file: " + fileName);
            for (String s  : data) {
                bw.write(s+"\r\n");
            }
            bw.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void numberLines(List<String> list){
        writeFile("1) number of lines in file1.txt\n"+list.size());
    }

    private void longestLine(List<String> list){
        String max = list.get(0);
        for (String string: list){
            if (string.length() > max.length()){
                max = string;
            }
        }
        writeFile("2) the longest line in file1.txt\n"+max);
    }

    private void findNameDate(List<String> list){
        String name;
        String date;
        String patternName = "[A-Z][a-z]+\\.";
        String patternDate = "\\d{2}\\.\\d{2}\\.\\d{4}\\.";
        Pattern p = Pattern.compile(patternName);
        Pattern p1 = Pattern.compile(patternDate);

        writeFile("3) your name and birthday date");
        for (String s: list) {
            Matcher m = p.matcher(s);
            while (m.find()) {
                name = s.substring(m.start(), m.end());
                writeFile(name);
            }
            Matcher m1 = p1.matcher(s);
            while (m1.find()) {
                date = s.substring(m1.start(), m1.end());
                writeFile(date);
            }
        }
    }
}

class MyRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " is working");
        }
        System.out.println(Thread.currentThread().getName() + " stopped working");
    }
}
