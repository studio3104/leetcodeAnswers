package com.studio3104.leetcode.explore.challenge.November.day27;

import java.util.Arrays;

class Solution {
    public boolean canPartition(int[] nums) {
        int total = Arrays.stream(nums).sum();
        if (total % 2 != 0) return false;

        int half = total / 2;
        boolean[][] dp = new boolean[nums.length + 1][half + 1];
        dp[0][0] = true;

        for (int i = 1; i <= nums.length; ++i) {
            int current = nums[i - 1];
            for (int j = 0; j <= half; ++j) {
                dp[i][j] = j < current ? dp[i - 1][j] : dp[i - 1][j] || (dp[i - 1][j - current]);
            }
        }

        return dp[nums.length][half];
    }
}
