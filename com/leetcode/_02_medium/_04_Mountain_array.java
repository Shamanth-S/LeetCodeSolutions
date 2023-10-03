package com.leetcode._02_medium;

import java.util.Scanner;

public class _04_Mountain_array {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter size: ");
        int size = in.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("arr[" + i + "]= ");
            arr[i] = in.nextInt();
        }
        System.out.println(peakIndexInMountainArray(arr));
    }

    public static int peakIndexInMountainArray(int[] arr) {
         int start = 0;
         int end = arr.length - 1;

         while (start < end) {

             int mid = start + (end - start) / 2;
             if(arr[mid] > arr[mid + 1]) {
                 end = mid;
             } else {
                 start = mid + 1;
             }
         }
         return start;
    }
}
