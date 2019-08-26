package ua.com.softserve.homework3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example1 {
    public static void main(String[] args) throws IOException {

        example1();
        example2();
        example3();
    }

    private static void example1() {
        float a = -2.8f;
        float b = 8.8f;
        float c = -8.9f;
        float x = 5.0f;
        float y = -5.0f;
        System.out.println("First example:");
        System.out.println(inRange(y, x, a));
        System.out.println(inRange(y, x, b));
        System.out.println(inRange(y, x, c));
    }

    private static boolean inRange(float left, float right, float number) {
        return number >= left && number <= right;
    }

    private static void example2() {
        System.out.println("Second example:");
        int i = 6;
        int p = 5;
        int o = 7;

        System.out.println("Max number = " + findMax(i,p,o));
        System.out.println("Min number = " + findMin(i,p,o));
    }

    private static int findMax(int i, int p, int o) {
        int max = i;
        if (p > max) {
            max = p;
        }
        if (o > max) {
            max = o;
        }
        return max;
    }


    private static int findMin(int i, int p, int o) {
        int min = i;
        if (p < min) {
            min = p;
        }
        if (o < min) {
            min = o;
        }
       return min;
    }

    private static void example3() throws IOException {
        System.out.println("Enter ERROR number:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());

        switch (input) {
            case 400:
                System.out.println(HttpError.BADREQUEST);
                break;
            case 401:
                System.out.println(HttpError.UNAUTHORIZED);
                break;
            case 402:
                System.out.println(HttpError.PAYMENTREQUIRED);
                break;
            default:
                System.out.println("Unknown error code!");
        }
    }
}

