package com.studio3104.leetcode.explore.collection.easy.dp.HouseRobber;

public class Solution {
    public int rob(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        if (nums.length == 2) return Math.max(nums[0], nums[1]);

        nums[2] = nums[0] + nums[2];

        for (int i = 3; i < nums.length; i++)
            nums[i] = nums[i] + Math.max(nums[i - 2], nums[i - 3]);

        return Math.max(nums[nums.length - 1], nums[nums.length - 2]);
    }
}
