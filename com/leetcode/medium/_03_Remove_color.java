package com.leetcode.medium;

import java.util.Scanner;

public class _03_Remove_color {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter string: ");
        String string = in.nextLine();

        System.out.println(winnerOfGame(string));
    }

    public static boolean winnerOfGame(String colors) {
        int a = 0;
        int b = 0;

        for (int i = 1; i < colors.length() - 1; i++) {
            if (colors.charAt(i) == 'A' && colors.charAt(i - 1) == 'A' && colors.charAt(i + 1) == 'A') {
                a++;
            } else if (colors.charAt(i) == 'B' && colors.charAt(i - 1) == 'B' && colors.charAt(i + 1) == 'B') {
                b++;
            }
        }

        return a > b;
    }
}
