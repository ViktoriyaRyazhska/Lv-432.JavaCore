package com.company;

public class PeaceThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                sleep(3000);
                System.out.println("Peace in the peace");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("My name is " + this.getClass());
    }
}
