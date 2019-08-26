package ua.com.softserve.homework4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example2 {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Input " + (i + 1) + " number:");
            numbers[i] = Integer.parseInt(br.readLine());
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        boolean calcSum = isCalcSum(numbers);
        if (calcSum) {
            System.out.println("Sum = " + calcSum(numbers));
        } else {
            System.out.println("Product = " + calcProduct(numbers));
        }
    }

    private static int calcProduct(int[] numbers) {
        int result = 1;
        for (int i = 5; i < 10; i++) {
            result *= numbers[i];
        }
        return result;
    }

    private static int calcSum(int[] numbers) {
        int result = 0;
        for (int i = 0; i < 5; i++) {
            result += numbers[i];
        }
        return result;
    }

    private static boolean isCalcSum(int[] numbers) {
        for (int i = 0; i < 5; i++) {
            if (numbers[i] < 0) {
                return false;
            }
        }
        return true;
    }

}