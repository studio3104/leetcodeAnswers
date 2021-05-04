package com.studio3104.leetcode.explore.challenge.y2021.May.day04;

class Solution {
    public boolean checkPossibility(int[] nums) {
        int countViolation = 0;

        for (int i = 1; i < nums.length; ++i) {
            if (nums[i] >= nums[i - 1]) {
                continue;
            }

            if (countViolation == 1) {
                return false;
            }
            ++countViolation;

            if (i < 2 || nums[i - 2] <= nums[i]) {
                nums[i - 1] = nums[i];
            } else {
                nums[i] = nums[i - 1];
            }
        }

        return true;
    }
}
