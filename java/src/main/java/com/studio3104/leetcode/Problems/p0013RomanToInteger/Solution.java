package com.studio3104.leetcode.Problems.p0013RomanToInteger;

public class Solution {
    public int romanToInt(String s) {
        int integer = 0;
        int index = 0;

        while (index < s.length()) {
            char a = s.charAt(index++);
            char b = index < s.length() ? s.charAt(index) : ' ';

            if (a == 'C') {
                if (b == 'M' || b == 'D') ++index;
                if (b == 'M') integer += 900;
                else if (b == 'D') integer += 400;
                else integer += 100;
            } else if (a == 'X') {
                if (b == 'C' || b == 'L') ++index;
                if (b == 'C') integer += 90;
                else if (b == 'L') integer += 40;
                else integer += 10;
            } else if (a == 'I') {
                if (b == 'X' || b == 'V') ++index;
                if (b == 'X') integer += 9;
                else if (b == 'V') integer += 4;
                else ++integer;
            }
            else if (a == 'M') integer += 1000;
            else if (a == 'D') integer += 500;
            else if (a == 'L') integer += 50;
            else if (a == 'V') integer += 5;
        }

        return integer;
    }
}
