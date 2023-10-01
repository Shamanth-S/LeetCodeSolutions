package com.leetcode.easy;

import java.util.Scanner;

public class _11_Reverse_string {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter a string:");
        String string = in.nextLine();

        System.out.print("Entered string is " + string + "\n");
        System.out.print("Reversed string is " + reverseWords(string));
    }

    public static String reverseWords(String s) {
        String[] reverse = s.split(" ");
        StringBuilder result = new StringBuilder();

        for (String string : reverse) {
            StringBuilder word = new StringBuilder(string).reverse();
            result.append(word).append(" ");
        }
        return result.toString().trim();
    }
}
