package com.leetcode.easy;

import java.util.Arrays;
import java.util.Scanner;

public class _04_Common_prefix {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = in.nextInt();

        String[] arr = new String[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("arr[" + i +"]= ");
            arr[i] = in.next();
        }

        System.out.println(Arrays.toString(arr));

        System.out.println(longestCommonPrefix(arr));
    }


    public static String longestCommonPrefix(String[] strings) {

        if (strings.length == 0) {
            return "";
        }

        int min = Integer.MAX_VALUE;
        for (String string : strings) {
            min = Math.min(min, string.length());
        }

        StringBuilder prefix = new StringBuilder();
        for (int i = 0; i < min; i++) {
            char ch = strings[0].charAt(i);
            for(String str : strings) {
                if (str.charAt(i) != ch) {
                    return prefix.toString();
                }
            }
            prefix.append(ch);
        }
        return prefix.toString();
    }
}
