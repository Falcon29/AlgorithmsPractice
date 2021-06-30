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

package Lesson0;

import sun.security.util.ArrayUtil;

public class RemoveDuplicates {
    public static void main( String[] args ) {
        int[] array = new int[]{1, 2, 2, 3, 4, 4, 5};

        System.out.println(removeDuplicates(array));
        System.out.println(removeTargets(array, 3));
    }

    private static int removeDuplicates(int[] nums) {
        int c = 0;   //define the 1st arrays member

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != nums[c]) {   //check if nums on place i not equals to nums on place c (0 != 0 for 1st iter)
                c++;                    //c = c + 1 if "if" - true
                nums[c] = nums[i];      //define abstract "num[c]" as current iteration place in array
            }
        }

        return c + 1;
    }

    private static int removeTargets(int[] nums, int target) {
        int c = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != target) {
                nums[c] = nums[i];
                c++;
            }
        }

        return c;
    }
}
