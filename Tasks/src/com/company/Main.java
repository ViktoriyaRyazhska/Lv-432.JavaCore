package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = -1;
        while (choice != 0) {
            System.out.println("Enter number of task :");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    Task1 t1 = new Task1();
                    t1.fibonachi();
                    break;
                case 2:
                    Task2 t2 = new Task2();
                    t2.degrees(100);
                    break;
                case 3:
                    Task3 t3 = new Task3();
                    t3.execute();
                    break;
                case 4:
                    Task4 t4 = new Task4();
                    t4.execute();
                    break;
                case 5:
                    System.out.println(Task5.isPalindrome());
                    break;
                case 6:
                    Task6.numberOfWords();
                    break;
                case 7:
                    TaskSeven.divideNumbers();
                    break;
                case 8:
                    System.out.println(TaskEight.convert());;
                    break;
                case 9:
                    System.out.println("Enter number ");
                    Task9.findOne(10);
                    break;
                case 10:
                    Task10.findOne();
                    break;
                case 11:
                    Task11.execute();
                    break;
                case 12:
                    Task12.execute();
                    break;
                case 13:
                    Task13.execute();
                    break;
                case 14:
                    Task14.execute();
                    break;
                default:
                    System.out.println("Goodbye!!");
                    break;
            }
        }
    }
}
