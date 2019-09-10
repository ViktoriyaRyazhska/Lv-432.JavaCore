package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task13 {
    private static List<Integer> generatePrimes(int upperLimit){
        List<Integer> primes = new ArrayList<>();
        boolean isPrime;
        int j;

        primes.add(2);

        for (int i = 3; i <= upperLimit; i += 2) {
            j = 0;
            isPrime = true;
            while (primes.get(j)*primes.get(j) <= i) {
                if (i % primes.get(j) == 0) {
                    isPrime = false;
                    break;
                }
                j++;
            }
            if (isPrime) {
                primes.add(i);
            }
        }

        return primes;
    }

    public  static void execute() {
        int divisorMax = 20;
        List<Integer> p = generatePrimes(divisorMax);
        int result = 1;

        for (Integer i:p
             ) {
            int a = (int) Math.floor(Math.log(divisorMax) / Math.log(i));
            result = result * ((int)Math.pow(i,a));
        }

        System.out.println("smallest positive number that is evenly divisible " +
                "by all of the numbers from 1 to 20 : " + result);
    }
}
