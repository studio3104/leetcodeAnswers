package com.studio3104.leetcode.explore.challenge.y2020.September.day30;

public class Solution {
    public int firstMissingPositive(int[] nums) {
        int countOne = 0;
        for (int i = 0; i < nums.length; ++i) {
            int num = nums[i];
            if (num == 1) ++countOne;
            if (num <= 0 || num > nums.length) nums[i] = 1;
        }
        if (countOne == 0) return 1;

        for (int i = 0; i < nums.length; ++i) {
            int num = Math.abs(nums[i]);
            if (num == nums.length) nums[0] = Math.abs(nums[0]) * -1;
            else nums[num] = Math.abs(nums[num]) * -1;
        }

        for (int i = 1; i < nums.length; ++i) {
            if (nums[i] > 0) return i;
        }

        return nums[0] > 0 ? nums.length : nums.length + 1;
    }
}
