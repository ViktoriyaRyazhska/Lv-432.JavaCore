package com.company;

public class Task1 {
    public static void main(String[] args) throws InterruptedException{
        Thread t1 = new Thread(new MyRunnable("Different message 1"));
        t1.start();
        t1.join();
        Thread t2 = new Thread(new MyRunnable("Different message 2"));
        t2.start();
        t2.join();
        Thread t3 = new Thread(new MyRunnable("Different message 3"));
        t3.start();
        t3.join();

    }

    static class MyRunnable implements Runnable {
        private String message;

        public MyRunnable(String message) {
            this.message = message;
        }

        @Override
        public void run() {
            int n = 5;
            while (--n > 0) {
                System.out.println(message);
            }
        }
    }
}
