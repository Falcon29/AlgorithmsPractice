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

public class LastWorldLength {
    public static void main( String[] args ) {
        System.out.println(lastWorldLength("Aaaaa aaa aaa aaaaaa"));
        System.out.println(lastWorldLength("A "));
    }

    private static int lastWorldLength(String s) {
        int count = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == 32 && count == 0) continue;
            if (s.charAt(i) == 32) return count;
            count++;
        }

        return count;
    }
}
