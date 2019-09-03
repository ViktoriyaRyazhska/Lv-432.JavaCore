package com.company;

public class Main {
    public static final Object monitor = new Object();
    public static final Object monitor2 = new Object();

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new MyRunnable("Message 1"));
        Thread t2 = new Thread(new MyRunnable("Message 2"));
        Thread t3 = new Thread(new MyRunnable("Message 3"));
//        Thread deadLock1 = new Thread(new DeadlockDemo());
//        Thread deadLock2 = new Thread(new DeadlockDemo2());
        Thread t4 = new Thread(new One());

//        t1.start();
//        t1.join();
//        t2.start();
//        t2.join();
//        t3.start();

        t4.start();

//        deadLock1.start();
//        deadLock2.start();
    }

    private static class One implements Runnable {
        @Override
        public void run() {
            new Thread(new Two()).start();
        }
    }

    private static class Two implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 3; i++) {
                System.out.println("Thread number two");
            }
            new Thread(new Three()).start();
        }
    }

    private static class Three implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread number three");
            }
        }
    }
}
