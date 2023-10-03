package com.leetcode.easy;

import java.util.Arrays;
import java.util.Scanner;

public class _13_Good_pairs {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter size of the array: ");
        int size = in.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter array elements: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("arr[" + i + "]= ");
            arr[i] = in.nextInt();
        }

        System.out.println(Arrays.toString(arr));

        System.out.println(numIdenticalPairs(arr));
    }

    public static int numIdenticalPairs(int[] num) {

        int count = 0;
        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if ( num[i] == num[j]) {
                    count += 1;
                }
            }
        }
        return count;
    }
}
