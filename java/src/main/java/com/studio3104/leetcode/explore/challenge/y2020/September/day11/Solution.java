package com.studio3104.leetcode.explore.challenge.y2020.September.day11;

public class Solution {
    public int maxProduct(int[] nums) {
        int maxSoFar = nums[0];
        int minSoFar = nums[0];
        int result = maxSoFar;

        for (int i = 1; i < nums.length; ++i) {
            int n = nums[i];
            int currentMax = Math.max(n, Math.max(n * maxSoFar, n * minSoFar));
            minSoFar = Math.min(n, Math.min(n * maxSoFar, n * minSoFar));
            maxSoFar = currentMax;
            result = Math.max(result, maxSoFar);
        }

        return result;
    }

    public int deprecatedMaxProduct(int[] nums) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; ++i) {
            int p = 1;
            for (int j = i; j < nums.length; ++j) {
                p *= nums[j];
                max = Math.max(max, p);
            }
        }

        return max;
    }
}
