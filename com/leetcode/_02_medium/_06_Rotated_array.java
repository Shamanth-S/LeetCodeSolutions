package com.leetcode._02_medium;

import java.util.Scanner;

public class _06_Rotated_array {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = in.nextInt();

        int[] num = new int[n];

        System.out.println("Enter the elements of the array(sorted in ascending/descending order): ");
        for (int i = 0; i < num.length; i++) {
            System.out.print("num[" + i + "] = ");
            num[i] = in.nextInt();
        }

        System.out.print("Enter search element: ");
        int ele = in.nextInt();

        System.out.println(search(num, ele));
    }

    public static int findPivot(int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }

            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static int findPivotDuplicates(int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }

            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                if (arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;
                if (arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;
            } else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
    public static int search(int[] num, int target) {

        int pivot = findPivot(num);

        if (pivot == -1) {
            return binarySearch(num, target, 0, num.length - 1);
        }
        if (num[pivot] == target) {
            return pivot;
        }
        if (target >= num[0]) {
            return binarySearch(num, target, 0, pivot - 1);
        }

        return binarySearch(num, target, pivot + 1, num.length - 1);

    }
    
    static int binarySearch(int[] arr, int target, int start, int end) {
        
        while (start <= end) {
            
            int mid = start + (end - start) / 2;
            
            if (arr[mid] == target) {
                return mid;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
