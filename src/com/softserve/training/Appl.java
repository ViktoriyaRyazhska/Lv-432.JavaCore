package com.softserve.training;

public class Appl {
    public static int sum = 0;
    public static Object monitor = new Object();

    //public synchronized static void go(long id) {
    public static void go(long id) {
        synchronized (monitor) {
            System.out.println("Current ID = " + id);
        }
    }
    
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main Thread ID = " + Thread.currentThread().getId());
        Runnable r1 = new Run1p();
        Thread t1 = new Thread(r1);
        Runnable r2 = new Run1m();
        Thread t2 = new Thread(r2);
        //t2.setPriority(Thread.MAX_PRIORITY - 1);
        //t1.setPriority(Thread.MIN_PRIORITY + 1);
        t1.start();
        t2.start();
        //
        t1.join();
        t2.join();
//        for (int i=0; i<100000; i++) {
//        	Thread.yield();
//        }
        //Thread.sleep(10);
        //
        //monitor.wait();
        //
        //System.out.print("Main Thread ID = " + Thread.currentThread().getId());
        System.out.println(" Main DONE, sum=" + sum);
    }
}
