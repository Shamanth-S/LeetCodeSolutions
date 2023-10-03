/*package com.leetcode._03_hard;

public class _01_Mountain_array {
    public static void main(String[] args) {

    }

    int search(int[] arr, int target) {
        int peak = peakIndexInMountainArray(arr);
        int firsttry = binarySearch(arr, target, 0, peak);
        if (firsttry != -1) {
            return firsttry;
        }
        return binarySearch(arr, target, peak + 1, arr.length - 1);
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

    public static int binarySearch(int[] arr, int target, int start, int end) {

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }
            if (arr[start] < arr[end]) {

                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target < arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
    public static int findInMountainArray(int target, MountainArray mountainArr) {

    }
}
*/