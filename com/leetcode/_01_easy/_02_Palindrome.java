package com.leetcode._01_easy;

import java.util.Scanner;

public class _02_Palindrome {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = in.nextInt();

        System.out.print("Is the given number." + num +" is a palindrome: " + palindrome(num));
        System.out.println();
    }
    public static boolean palindrome(int num) {
        if (num < 0) return false;

        int normal = num;
        int reverse = 0;

        while(num != 0) {
            int a = num % 10;
            reverse = reverse *  10 + a;
            num /= 10;
        }
        return normal == reverse;
    }
}