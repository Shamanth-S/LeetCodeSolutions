package com.leetcode._01_easy;

import java.util.HashMap;
import java.util.Scanner;

public class _03_RomanToInteger {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter Roman digits 'I' or 'V' or 'X' or 'L' or 'C' or 'D' or 'M': ");
        String roman = in.next();

        System.out.println(romanToInteger(roman));
    }

    public static int romanToInteger(String solution){

        HashMap<Character, Integer> m = new HashMap<>();

        m.put('I', 1);
        m.put('V', 5);
        m.put('X', 10);
        m.put('L', 50);
        m.put('C', 100);
        m.put('D', 500);
        m.put('M', 1000);

        int ans = 0;

        for (int i = 0; i < solution.length(); i++) {
            if (i < solution.length() - 1 && m.get(solution.charAt(i)) < m.get(solution.charAt(i + 1))) {
                ans -= m.get(solution.charAt(i));
            } else {
                ans += m.get(solution.charAt(i));
            }
        }

        return ans;
    }
}
