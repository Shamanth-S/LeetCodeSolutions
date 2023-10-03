package com.leetcode._01_easy;

import java.util.Scanner;

public class _08_Monotonic_array {
    public static class Monotonic_array{

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

            boolean result = isMonotonic(num);
            System.out.println(result);
            in.close();
        }

        public static boolean isMonotonic(int[] num) {

            boolean inc = true;
            boolean dec = true;

            for (int i = 1; i < num.length; i++) {
                if (num[i] > num[i - 1]) {
                    dec = false;
                } else if (num[i] < num[i - 1]) {
                    inc = false;
                }
                if (!inc && !dec) {
                    return false;
                }
            }
            return true;
        }
    }
}
