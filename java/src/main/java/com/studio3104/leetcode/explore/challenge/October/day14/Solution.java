package com.studio3104.leetcode.explore.challenge.October.day14;

public class Solution {
    private int rob(int[] nums, int start, int end) {
        int a = 0, b = 0;

        for (int i = start; i < end; ++i) {
            int n = nums[i], c = a;
            a = Math.max(n + b, a);
            b = c;
        }

        return a;
    }

    public int rob(int[] nums) {
        if (nums.length == 1) return nums[0];
        if (nums.length == 2) return Math.max(nums[0], nums[1]);

        return Math.max(rob(nums, 0, nums.length - 1), rob(nums, 1, nums.length));
    }
}
