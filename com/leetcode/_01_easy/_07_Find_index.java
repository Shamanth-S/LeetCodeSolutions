package com.leetcode._01_easy;

import java.util.Scanner;

public class _07_Find_index {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String string = in.nextLine();

        System.out.print("Enter sub-string:");
        String sub = in.next();

        int result = strStr(string, sub);

        System.out.println(result);
    }

    public static int strStr(String haystack, String needle) {

        int index = -1;
        boolean present = haystack.contains(needle);
        if (present) {
            index = haystack.indexOf(needle);
        }
        return index;
    }
}

