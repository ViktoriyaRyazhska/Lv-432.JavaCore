package com.company;

public class Task2Ver2 implements Runnable {
    private int sleepTimer;
    private String message;

    public Task2Ver2(int sleepTimer, String message) {
        this.sleepTimer = sleepTimer;
        this.message = message;
    }

    @Override
    public void run() {
        for(int i = 0; i < 5; i++) {
            try {
                Thread.sleep(sleepTimer);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(message);
        }
        System.out.println("My name is : " + toString());
    }

    @Override
    public String toString() {
        return "Task2Ver2{" +
                "sleepTimer=" + sleepTimer +
                ", message='" + message + '\'' +
                '}';
    }
}
