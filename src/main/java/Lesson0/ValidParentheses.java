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

import java.util.Stack;

public class ValidParentheses {
    private static final String SQUARE = "[]";
    private static final String SMOOTH = "()";
    private static final String FIGURE = "{}";

    public static void main( String[] args ) {
        System.out.println(isValidUneffective("{}({()[]{}}){}({()[]{}}){}({()[]{}}){}({()[]{}})"));
        System.out.println(isValidUneffective("{(]}]"));
//        System.out.println(isValid("{(]"));
//        System.out.println(isValid("{]"));
//        System.out.println(isValid("[({(())}[()])]"));
    }

//    private static boolean isValid(String s) {
//        if (s.length() % 2 != 0) return false;
//
//        Stack<Character> stack = new Stack<>();
//
//        for (int i = 0; i < s.length(); i++) {
//            char c = s.charAt(i);
//
//            if (c == '(' || c == '{' || c == '[') {
//                stack.push(c);
//            } else if (c ==')' && stack.pop() != '(') {
//                return false;
//            } else if (c =='}' && stack.pop() != '{') {
//                return false;
//            } else if (c ==']' && stack.pop() != '[') {
//                return false;
//            } else if (stack.empty()) {
//                return false;
//            }
//        }
//
//        return stack.empty();
//    }

    private static boolean isValidUneffective(String s) {
        while (!s.isEmpty()) {
            if (s.length() % 2 != 0) return false;

            if (s.contains(SQUARE)) {
                s = s.replace(SQUARE, "");
            } else if (s.contains(SMOOTH)) {
                s = s.replace(SMOOTH, "");
            } else if (s.contains(FIGURE)) {
                s = s.replace(FIGURE, "");
            } else {
                return false;
            }
        }

        return true;
    }
}
