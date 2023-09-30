package com.leetcode.medium;

import java.util.Arrays;
import java.util.Scanner;

public class _02_First_last {
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

        System.out.println("Enter search");
        int search = in.nextInt();

        System.out.print("Elements of the array are: " + Arrays.toString(arr));
        System.out.println();

        System.out.print(Arrays.toString(searchRange(arr, search)));
        System.out.println();
        in.close();
    }
    public static int[] searchRange(int[] num, int target) {

        int[] ans = {-1, -1};
        ans[0] = search(num, target, true);
        if (ans[0] != -1) {
            ans[1] = search(num, target, false);
        }
        return ans;
    }

    static int search(int[] arr, int target, boolean findStartIndex) {

        int ans = -1;

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                ans = mid;

                if (findStartIndex) {
                    end = mid -1;
                } else {
                    start = mid + 1;
                }
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }
}
