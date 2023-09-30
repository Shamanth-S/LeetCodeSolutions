package com.leetcode.easy;

import java.util.Scanner;

public class _09_Remove_duplicate {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = in.nextInt();

        int[] num = new int[n];

        System.out.println("Enter the elements of the array(sorted (ascending / descending): ");
        for (int i = 0; i < num.length; i++) {
            System.out.print("num[" + i + "] = ");
            num[i] = in.nextInt();
        }

        int result = removeDuplicate(num);
        System.out.println(result);
        in.close();
    }

    public static int removeDuplicate(int[] num) {
        int k = 0;
        for (int i = 1; i < num.length; i++) {
            if (num[i] != num[i - 1]) {
                num[k] = num[i];
                k++;
            }
        }
        return k;
    }
}
