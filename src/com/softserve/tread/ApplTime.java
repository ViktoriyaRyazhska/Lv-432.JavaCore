package com.softserve.tread;

public class ApplTime {

    public static void main(String[] args) {
    	System.out.println("main(): Thread ID = " + Thread.currentThread().getId());
        DialogTime dt = new DialogTime();
        dt.setVisible(true);
        System.out.println("main(): Thread ID = " + Thread.currentThread().getId());
    }

}
