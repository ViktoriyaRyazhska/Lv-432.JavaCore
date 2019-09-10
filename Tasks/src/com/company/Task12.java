package com.company;

import java.util.ArrayList;
import java.util.List;

public class Task12 {
    private void execute() {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i <= 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                numbers.add(i);
            }
        }

        long result = numbers.stream().mapToLong(i -> i).sum();

        System.out.println(" sum of all the multiples of 3 or 5 below 1000 : " + result);
    }
}
