package com.leetcode.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class _01_Two_sum {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the size of the array:");
        int n = in.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        System.out.print("Elements are ");
        for (int j : arr) {
            System.out.print(j + " ");
        }

        System.out.println();
        System.out.print("Enter the sum to be searched ");
        int search = in.nextInt();
        System.out.println(Arrays.toString(twoSum(arr, search)));
    }

    public static int[] twoSum(int[] num, int target) {
        HashMap<Integer, Integer> number = new HashMap<>();

        for (int i = 0; i < num.length; i++) {
            int comp = target - num[i];

            if (number.containsKey(comp)) {
                return new int[]{number.get(comp), i};
            }
            number.put(num[i], i);
        }
        return null;
    }
}