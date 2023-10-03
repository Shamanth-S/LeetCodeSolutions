package com.leetcode._01_easy;

import java.util.Arrays;
import java.util.Scanner;

public class _12_Search_position {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter size of the array: ");
        int size = in.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("arr[" + i + "]= ");
            arr[i] = in.nextInt();
        }

        System.out.print("The array is: " + Arrays.toString(arr));
        System.out.println();

        System.out.print("Enter search: ");
        int search = in.nextInt();

        int result = searchInsert(arr, search);

        System.out.println(result);
    }

    public static int searchInsert(int[] num, int target) {

        int start = 0, mid = Integer.MIN_VALUE;
        int end = num.length - 1;

        while (start <= end) {
            mid = start + (end - start) / 2;

            if (target == num[mid]) {
                return mid;
            } else if (target < num[mid]) {
                end = mid - 1;
            } else if (target > num[mid]) {
                start = mid + 1;
            }
        }
        return start;
    }
}
