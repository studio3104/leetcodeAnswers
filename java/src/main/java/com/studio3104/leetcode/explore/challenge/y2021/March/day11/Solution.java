package com.studio3104.leetcode.explore.challenge.y2021.March.day11;

import java.util.Arrays;

class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, dp.length);
        dp[0] = 0;

        for (int i = 1; i < dp.length; ++i) {
            for (int c : coins) {
                if (i < c) continue;
                dp[i] = Math.min(dp[i], dp[i - c] + 1);
            }
        }

        return dp[amount] == dp.length ? -1 : dp[amount];
    }
}
