package com.leetcode.easy;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class _05_Valid_parentheses {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter string:");
        String str =in.nextLine();

        System.out.println(Arrays.toString(str.toCharArray()));

        boolean result = isValid(str);

        System.out.println(result);
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false;
                char open = stack.pop();
                if ((c == ')' && open != '(') ||
                        (c == ']' && open != '[') ||
                        (c == '}' && open != '{')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
