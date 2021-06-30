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

import java.util.HashMap;
import java.util.Map;

public class RomanNumber {
    public static void main( String[] args ) {
        System.out.println(romanConverter( "XLIIV" ));
        System.out.println(romanConverter( "LXVVI" ));

        System.out.println(romanConverterFast( "XLIIV" ));
        System.out.println(romanConverterFast( "LXVVI" ));
    }

    private static Map<String, Integer> romanNumbers = new HashMap<String, Integer>() {{
        put("I", 1);
        put("V", 5);
        put("X", 10);
        put("L", 50);
        put("C", 100);
        put("D", 500);
        put("M", 1000);
    }};

    private static Map<Character, Integer> romanNumbersChar = new HashMap<Character, Integer>() {{
        put('I', 1);
        put('V', 5);
        put('X', 10);
        put('L', 50);
        put('C', 100);
        put('D', 500);
        put('M', 1000);
    }};

    private static int romanConverter(String s) {
        int sum = 0;
        int current, previous = 0;

        String[] sArr = s.split("");

        for (int i = s.length() - 1; i >= 0; i--) {
            current = romanNumbers.get(sArr[i]);

            if (current >= previous) {
                sum += current;
            } else {
                sum -= current;
            }

            previous = current;
        }

        return sum;
    }

    private static int romanConverterFast(String s) {
        int sum = 0;

        int current, previous = 0;

        for ( int i = s.length() - 1; i >= 0; i-- ) {
            char c = s.charAt( i );
            current = romanNumbersChar.get(c);

            if ( current >= previous ) {
                sum += current;
            } else {
                sum -= current;
            }

            previous = current;
        }

        return sum;
    }
}
