package com.company;

public class HelloWorldThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                sleep(2000);
                System.out.println("Hello, World");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("My name is " + this.getClass());
    }


}
