package com.company;

public class Main {

    public static void main(String[] args) {
        // Task1
        Task1 r = new Task1();
        Thread t = new Thread(r);
        r.run();

        // Task2
        HelloWorldThread hwt = new HelloWorldThread();
        PeaceThread pt = new PeaceThread();
        hwt.run();
        pt.run();

        // Task2 v2
        new Thread(new Task2Ver2(2000, "Hello, World")).run();
        new Thread(new Task2Ver2(3000, "Peace in the peace")).run();

        Task3.task3("jquery-3.4.1.js");

        Task3v2.task3v2("jquery-3.4.1.js");
    }
}
