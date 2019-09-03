package com.company;

public class DeadlockDemo2 implements Runnable {
    @Override
    public void run() {
        synchronized (Main.monitor2) {
            System.out.println("Thread 2 locked ");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
            }
            System.out.println("Thread 2 waiting lock 1");

            synchronized (Main.monitor) {
                System.out.println("Thread 2 locked 1 & 2");
            }
        }
    }
}
