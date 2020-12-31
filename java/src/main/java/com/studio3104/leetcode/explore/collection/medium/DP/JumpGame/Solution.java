package com.studio3104.leetcode.explore.collection.medium.DP.JumpGame;

class Solution {
    public boolean canJump(int[] nums) {
        int p = nums.length - 1;

        for (int i = nums.length - 1; i >= 0; --i) {
            if (i + nums[i] >= p) {
                p = i;
            }
        }

        return p == 0;
    }
}
