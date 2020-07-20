package com.studio3104.leetcode.explore.challenge.july.day19;

public class Solution {
    public String addBinary(String a, String b) {
        if (a.length() < b.length()) return addBinary(b, a);

        int carry = 0;
        int i = a.length() - 1, j = b.length() - 1;
        StringBuilder sum = new StringBuilder();

        while (i >= 0) {
            if (a.charAt(i--) == '1') ++carry;
            if (j >= 0 && b.charAt(j--) == '1') ++carry;

            if (carry % 2 == 1) sum.append('1');
            else sum.append('0');

            carry /= 2;
        }

        if (carry == 1) sum.append('1');
        sum.reverse();

        return sum.toString();
    }
}
