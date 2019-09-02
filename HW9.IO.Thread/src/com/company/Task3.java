package com.company;

public class Task3 {
    private static class FirstRunnable implements Runnable{
        @Override
        public void run() {
            new Thread(new SecondRunnable()).start();
        }
    }

    private static class SecondRunnable implements Runnable{
        @Override
        public void run() {
            int n = 3;
            while (n-- > 0) {
                System.out.println("Thread number two");
            }
            new Thread(new ThirdRunnable()).start();
        }
    }

    private static class ThirdRunnable implements Runnable{
        @Override
        public void run() {
            int n = 5;
            while (n-- > 0) {
                System.out.println("Thread number three");
            }
        }
    }

    public static void main(String[] args) {
        new Thread(new FirstRunnable()).start();
    }
}
