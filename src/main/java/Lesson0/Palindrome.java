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

public class Palindrome {
    public static void main( String[] args ) {
        System.out.println(isPalindrome( 199 ));
        System.out.println(isPalindrome( 1919119191 ));
    }

    //Is argument number palindrome?
    private static boolean isPalindrome(int x) {
        if (x < 0) return false;

        char[] xArr = String.valueOf(x).toCharArray();

        boolean isP = true;

        for (int i = 0; i <= xArr.length - 1; i++) {
            if (xArr[i] != xArr[xArr.length - (i + 1)]) {
                isP = false;
            }
        }

        return isP;
    }
}
