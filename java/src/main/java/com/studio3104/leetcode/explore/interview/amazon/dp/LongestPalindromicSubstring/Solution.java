package com.studio3104.leetcode.explore.interview.amazon.dp.LongestPalindromicSubstring;

public class Solution {
    boolean isPalindrome(String s, int start, int end) {
        if (start < 0 || end > s.length()) return false;
        if (start > end) return true;
        return s.charAt(start) == s.charAt(end) && isPalindrome(s, start + 1, end - 1);
    }

    public String longestPalindrome(String s) {
        switch (s.length()) {
            case 0:
            case 1:
                return s;
            case 2: return s.charAt(0) == s.charAt(1) ? s : Character.toString(s.charAt(0));
        }

        int[] longestRange = new int[]{0, 0};

        for (int start = 0; start < s.length(); start++) {
            for (int end = s.length() - 1; start < end; end--) {
                if (end - start > longestRange[1] - longestRange[0] && isPalindrome(s, start, end)) {
                    longestRange[0] = start;
                    longestRange[1] = end;
                }
            }
        }

        return s.substring(longestRange[0], longestRange[1] + 1);
    }
}
