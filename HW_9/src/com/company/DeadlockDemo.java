package com.company;

public class DeadlockDemo implements Runnable {
    @Override
    public void run() {
        synchronized (Main.monitor) {
            System.out.println("Thread 1 locked ");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread 1 waiting lock 2");
            synchronized (Main.monitor2) {
                System.out.println("Thread 1 locked 1 & 2");
            }
        }
    }
}
