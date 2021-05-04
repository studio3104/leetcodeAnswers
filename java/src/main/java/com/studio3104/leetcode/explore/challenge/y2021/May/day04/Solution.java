package com.studio3104.leetcode.explore.challenge.y2021.May.day04;

class Solution {
    public boolean checkPossibility(int[] nums) {
        int countViolation = 0;
        for (int i = 1; i < nums.length; ++i) {
            if (nums[i] < nums[i - 1]) {
                ++countViolation;
            }
            if (countViolation > 1) {
                return false;
            }
        }
        return true;
    }
}
