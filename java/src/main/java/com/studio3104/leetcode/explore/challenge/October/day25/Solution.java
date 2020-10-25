package com.studio3104.leetcode.explore.challenge.October.day25;

class Solution {
    public boolean winnerSquareGame(int n) {
        boolean[] dp = new boolean[n + 1];

        for (int i = 0; i <= n; ++i) {
            for (int k = 1; k * k <= i; ++k) {
                if (!dp[i - k * k]) {
                    dp[i] = true;
                    break;
                }
            }
        }

        return dp[n];
    }
}
