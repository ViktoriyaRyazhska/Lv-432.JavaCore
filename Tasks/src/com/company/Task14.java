package com.company;

import java.util.Arrays;

public class Task14 {
    private static int S[] = new int[]{1, 2, 5, 10, 20, 50, 100, 200};


    private static long countWays(int n) {
        int m = S.length;
        long[] table = new long[n + 1];

        // Initialize all table values as 0
        Arrays.fill(table, 0);   //O(n)

        // Base case (If given value is 0)
        table[0] = 1;

        // Pick all coins one by one and update the table[]
        // values after the index greater than or equal to
        // the value of the picked coin
        for (int i = 0; i < m; i++)
            for (int j = S[i]; j <= n; j++)
                table[j] += table[j - S[i]];

        return table[n];
    }

    public static void execute() {
        System.out.println(countWays( 4));
    }
}
