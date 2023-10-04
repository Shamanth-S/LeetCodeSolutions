package com.leetcode._01_easy;

import java.util.Scanner;

public class _14_Smallest_letter {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter size: ");
        int size = in.nextInt();

        char[] string = new char[size];

        System.out.println("Enter array:");
        for (int i = 0; i < string.length; i ++) {
            System.out.print("arr[" + i +"]= ");
            string[i] = in.next().charAt(0);
        }

        System.out.print("Enter target: ");
        char target = in.next().charAt(0);

        System.out.println(nextGreatestLetter(string, target));
    }
    public static char nextGreatestLetter(char[] arr, char target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return arr[start % arr.length];
    }
}
