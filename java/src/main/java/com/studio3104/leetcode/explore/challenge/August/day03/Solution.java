package com.studio3104.leetcode.explore.challenge.August.day03;

public class Solution {
    public boolean isPalindrome(String s) {
        if (s.isEmpty() || s.isBlank()) return true;

        int i = 0, j = s.length() - 1;

        while (i < j) {
            char c1 = s.charAt(i), c2 = s.charAt(j);

            if (!Character.isAlphabetic(c1) && !Character.isDigit(c1)) {
                ++i; continue;
            }
            if (!Character.isAlphabetic(c2) && !Character.isDigit(c2)) {
                --j; continue;
            }

            if (Character.toLowerCase(c1) != Character.toLowerCase(c2)) return false;

            ++i; --j;
        }

        return true;
    }
}
