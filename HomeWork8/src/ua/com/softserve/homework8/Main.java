package ua.com.softserve.homework8;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter first  double numbers : ");
            double a = Double.parseDouble(br.readLine());
            System.out.println("Enter second  double numbers : ");
            double b = Double.parseDouble(br.readLine());
            System.out.println(div(a, b));
            br.close();
        } catch (NumberFormatException e) {
            System.out.println("ERROR FOUND: " + e);
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("ERROR FOUND: " + e);
            e.printStackTrace();
        }

    }

    public static double div(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return a / b;
    }
}
//    public static int readNumber(int start, int end){
//
//    }
//}
