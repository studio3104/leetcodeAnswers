package com.studio3104.leetcode.explore.challenge.November.day27;

import java.util.Arrays;

class Solution {
    public boolean canPartition(int[] nums) {
        if (nums.length <= 1) {
            return false;
        }

        Arrays.sort(nums);

        int head = 0, tail = nums.length - 1;
        int sumA = nums[head++], sumB = nums[tail--];

        while (head <= tail) {
            if (sumA < sumB) {
                sumA += nums[head++];
            } else {
                sumB += nums[tail--];
            }
        }

        return sumA == sumB;
    }
}
