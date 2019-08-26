package ua.com.softserve.homework4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example3 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arrayNumbers = new int[5];
        for (int i = 0; i < arrayNumbers.length; i++) {
            System.out.println("Input " + (i + 1) + " number");
            arrayNumbers[i] = Integer.parseInt(br.readLine());
        }

        int positionOfNumber = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arrayNumbers.length; i++) {
            if (arrayNumbers[i] < min) {
                min = arrayNumbers[i];
                positionOfNumber = i;
            }
        }
        System.out.println("Min = " + min + " it is position = " + positionOfNumber);

        int secondPositivePosition = 0;
        boolean firstPositiveFound = false;
        boolean secondPositiveFound = false;

        for (int i = 0; i < arrayNumbers.length; i++) {
            if (arrayNumbers[i] > 0 && firstPositiveFound) {
                secondPositivePosition = i;
                secondPositiveFound = true;
                break;
            }
            if (arrayNumbers[i] > 0) {
                firstPositiveFound = true;
            }
        }

        if (secondPositiveFound) {
            System.out.println("Second positive number is  " + secondPositivePosition);
        }
    }
}
