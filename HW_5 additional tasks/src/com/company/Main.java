package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList arr = new ArrayList();

        // #1 Номер століття
//        System.out.println("Print year: ");
//        System.out.println("It is " + ((Integer.parseInt(br.readLine()) + 99)) / 100 + " century");

        //#2 Утворити послідовність Х
//        for (int i = 0; i < 19; i++) {
//            System.out.println(Calc.calculateX(i));
//        }

        //#3 Знайти суму ряду
//        System.out.println(Calc.calculateSumOfSeries(30));

        //#4 Послідовність сум
//        System.out.println("Print count of numbers: ");
//        int count = Integer.parseInt(br.readLine());
//        for (int i = 0; i < count; i++) {
//            System.out.println("Print № " + i);
//            arr.add(Integer.parseInt(br.readLine()));
//        }
//        Calc.calcSumABS(arr);

        //#5 Трикутник
//        System.out.println("Print sides of the triangle: ");
//        int a = Integer.parseInt(br.readLine());
//        int b = Integer.parseInt(br.readLine());
//        int c = Integer.parseInt(br.readLine());
//        Calc.triangle(a, b, c);

        //#6 Знайти число що відрізняється
//        System.out.println("Print 4 numbers: ");
//        List<Integer> numbers = new ArrayList<>();
//        numbers.add(Integer.parseInt(br.readLine()));
//        numbers.add(Integer.parseInt(br.readLine()));
//        numbers.add(Integer.parseInt(br.readLine()));
//        numbers.add(Integer.parseInt(br.readLine()));
//        Calc.findNumber(numbers);

        //#7 ⦁	Задано ціле число  k (від 1 до 180). Визначити, яка цифра знаходиться в k-ій позиції послідовності 10111213…9899
//        StringBuilder str = new StringBuilder();
//        for (int i = 10; i<100; i++){
//            str.append(i);
//        }
//        System.out.println("Print position 0-179: ");
//        System.out.println(str.charAt(Integer.parseInt(br.readLine())));

        //#8 ⦁	Обчислити с – найбільший спільний дільник заданих натуральних чисел a і b
//        System.out.println("Print two numbers: ");
//        Calc.findBiggestDiv(Integer.parseInt(br.readLine()), Integer.parseInt(br.readLine()));

        // #9 ⦁	Обчислити значення виразу y=cos(1+cos(2+…+cos(39+cos40)…)).
//        Double res = Math.cos(40);
//        for (int i = 39; i>0; i--){
//            res+=Math.cos(i+res);
//        }
//        System.out.println(res);

        // #10 Скільки тчок належить кругу.
//        System.out.println("Print radius: ");
//        int radius = Integer.parseInt(br.readLine());
//        System.out.println("Print count of points(minimum 2): ");
//        List<Integer> points = new ArrayList<>();
//        int countOfPoints = Integer.parseInt(br.readLine());
//        for (int i = 0; i < countOfPoints; i++) {
//            System.out.println("Print point " + i);
//            points.add(Integer.parseInt(br.readLine()));
//        }
//        Calc.calculateCircle(radius, points);

        //#11 Прилавок
//        System.out.println("Print buyer count: ");
//        int buyerCount = Integer.parseInt(br.readLine());
//        List<Integer> serviceTime = new ArrayList<>();
//        for (int i = 0; i < buyerCount; i++) {
//            System.out.println("Print service time for " + (i + 1) + " buyer");
//            serviceTime.add(Integer.parseInt(br.readLine()));
//        }
//        System.out.println("Write the number of the buyer what service time you want to see(" + 1 + "-" + buyerCount + "): ");
//        int buyerNumber = Integer.parseInt(br.readLine());
//        try {
//            Calc.calculateBuyers(serviceTime, buyerNumber);
//        } catch (IllegalArgumentException e){
//            System.out.println(e.getMessage());
//        }

        //#12 Оцінки
//        System.out.println("Print count of rating(minimum 3): ");
//        int countRatings = Integer.parseInt(br.readLine());
//        List<Integer> ratings = new ArrayList<>();
//        for (int i = 0; i < countRatings; i++) {
//            System.out.println("Print rating # " + (i + 1));
//            ratings.add(Integer.parseInt(br.readLine()));
//        }
//        Calc.calculateRating(ratings);
    }
}
