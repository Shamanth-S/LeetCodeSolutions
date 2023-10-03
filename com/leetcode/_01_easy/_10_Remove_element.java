package com.leetcode._01_easy;

import java.util.Scanner;

public class _10_Remove_element {
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

        System.out.print("Enter element to be delete: ");
        int target = in.nextInt();
        int result = removeElement(num, target);
        System.out.println(result);
        in.close();
    }
    public static int removeElement(int[] num, int val) {
        int k = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] != val) {
                num[k] = num[i];
                k++;
            }
        }
        return k;
    }
}
