package com.leetcode._01_easy;

import java.util.Arrays;
import java.util.Scanner;

public class _06_Sort_parity {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = in.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array(sorted (ascending / descending): ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("arr[" + i + "] = ");
            arr[i] = in.nextInt();
        }

        System.out.print("Elements of the array are: " + Arrays.toString(arr));
        System.out.println();

        System.out.print(Arrays.toString(sortArrayByParity(arr)));
        System.out.println();
        in.close();
    }

    public static int[] sortArrayByParity(int[] num) {

        int[] a = new int[num.length];
        int j = 0;
        for (int k : num) {
            if (k % 2 == 0) {
                a[j] = k;
                j++;
            }
        }

        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 != 0) {
                a[j] = num[i];
                j++;
            }
            num[i] = a[i];
        }
        return num;
    }
}
