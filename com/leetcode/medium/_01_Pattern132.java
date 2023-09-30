package com.leetcode.medium;

import java.util.Scanner;
import java.util.Stack;

public class _01_Pattern132 {
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

        boolean result = find132pattern(num);
        System.out.println(result);
        in.close();
    }

    public  static boolean find132pattern(int[] num) {
        int min = Integer.MIN_VALUE;
        Stack<Integer> stack = new Stack<>();
        int n = num.length;
        for (int i = n - 1; i >= 0; i--) {
            if (num[i] < min)
                return true;
            while (!stack.isEmpty() && num[i] > stack.peek())
                min = Math.max(min, stack.pop());
            stack.push(num[i]);
        }
        return false;
    }
}


