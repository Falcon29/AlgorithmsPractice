/*
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

package Lesson2;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class GreedyAlgorithms {
    public static void main( String[] args ) {
        int[] digits = {3, 1, 7, 9, 9, 5};

        System.out.print( maxNumberFromDigits( digits ) );
    }

    //На каждом шаге из исходного массива берется наибольшая цифра и ставится в начало строки
    private static String maxNumberFromDigits(int[] digs) {
        //{3, 1, 7, 9, 9, 5}  -> {1, 3, 7, 5, 9, 9}
        //sorting: O(n*log(n))
        //concat string: O(n)
        //complexity: O(n*log(n))

//        Arrays.sort(digs);
//
//        StringBuilder result = new StringBuilder();
//
//        for (int i = digs.length - 1; i >= 0; i--) {
//            result.append(digs[i]);
//        }

        //return result.toString();

        return String.join("",  //join string with delimiter ""
                Arrays.stream(digs).boxed() //boxed - stream of wrappers (simulate stream of primitives)
                .sorted(Collections.reverseOrder()) //sort by reversing order 1. 1, 2, 3... -> 2. 3, 2, 1...
                .map(String::valueOf)  //each element to string by value (1 -> "1")
                .toArray(String[]::new));  //to array of strings
    }

}
