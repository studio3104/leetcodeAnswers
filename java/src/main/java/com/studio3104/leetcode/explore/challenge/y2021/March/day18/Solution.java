package com.studio3104.leetcode.explore.challenge.y2021.March.day18;

public class Solution {
    public int wiggleMaxLength(int[] nums) {
        if (nums.length <= 1) {
            return nums.length;
        }

        int previousDiff = nums[1] - nums[0];
        int count = previousDiff != 0 ? 2 : 1;

        for (int i = 2; i < nums.length; ++i) {
            int diff = nums[i] - nums[i - 1];
            if (diff > 0 && previousDiff <= 0 || diff < 0 && previousDiff >= 0) {
                ++count;
                previousDiff = diff;
            }
        }

        return count;
    }
}
