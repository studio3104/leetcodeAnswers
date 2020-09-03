package com.studio3104.leetcode.explore.challenge.September.day03;

class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();
        int[] dp = new int[n];

        for (int i = 1; i < n; ++i) {
            int j = dp[i - 1];
            while (j > 0 && s.charAt(i) != s.charAt(j)) j = dp[j - 1];
            if (s.charAt(i) == s.charAt(j)) ++j;
            dp[i] = j;
        }

        int l = dp[n - 1];
        return l != 0 && n % (n - l) == 0;
    }
}
