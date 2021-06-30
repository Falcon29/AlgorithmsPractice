package Lesson1;/*
 *
 * =======================================================================
 *
 * Copyright (c) 2009-2021 Sony Network Entertainment International, LLC. All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Sony Network Entertainment International, LLC.
 * You shall not disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into with
 * Sony Network Entertainment International, LLC.
 *
 * =======================================================================
 *
 * For more information, please see http://www.sony.com/SCA/outline/corporation.shtml
 *
 */

import java.util.Arrays;

public class Fibonacci {

    public static void main( String[] args ) {
        int n = 100;
        long[] memoization = new long[n + 1];

        Arrays.fill(memoization, -1);

        System.out.println(fibonacciRow( n, memoization ));
        System.out.println(fibonacciRow( n ));
    }

    // O(2^n) if No memoization, but now O(n)
    private static long fibonacciRow(int n, long[] array) {
        if (array[n] != -1) {
            return array[n];
        }

        if (n <= 1) {
            return n;
        }

        long result = fibonacciRow( n - 1, array ) + fibonacciRow( n - 2, array );
        array[n] = result;

        return result;
    }

    // O(n) - сложность алгоритма (оценка "Большое О").
    // n=2 => iterations=1
    // n=3 => iterations=2
    // n=4 => iterations=3
    private static long fibonacciRow(int n) {
        // O(n) - initialisation of array
        long[] row = new long[n + 1];

        row[0] = 0;
        row[1] = 1;

        for (int i = 2; i <= n; i++) {
            row[i] = row[i - 1] + row[i - 2];
        }

        return row[n];
    }
}
