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

package lesson0;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main( String[] args ) {
        System.out.print( Arrays.toString( twoSumFast( new int[]{1, 2, 5, 77, 1230, 78, 13, 11, 113, 64, 3, 44, 125, 111, 2, 31, 123}, 81 ) ) );
    }

    //2 elements of array, which sum = target . Complexity = n ^ 2
    private static int[] twoSum(int[] array, int target) {
        int[] out = new int[2];

        for (int i = 0; i < array.length - 1; i ++) {
            for (int j = i + 1; j < array.length - 1; j ++) {
                if (array[i] + array[j] == target) {
                    out[0] = i;
                    out[1] = j;
                }
            }
        }

        return out;
    }

    private static int[] twoSumFast(int[] array, int target) {
        int[] out = new int[2];
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < array.length - 1; i ++) {
            if (map.containsKey(target-array[i])) {   //if map contains key with value target-array element
                out[1] = i;
                out[0] = map.get(target-array[i]);
            }

            map.put(array[i], i);
        }

        return out;
    }
}
