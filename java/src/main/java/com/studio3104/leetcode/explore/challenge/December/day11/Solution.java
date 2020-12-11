package com.studio3104.leetcode.explore.challenge.December.day11;

class Solution {
    public void shiftElement(int[] nums, int index) {
        if (nums.length - (index + 1) < 0) return;
        System.arraycopy(nums, index + 1, nums, index + 1 - 1, nums.length - (index + 1));
    }

    public int removeDuplicates(int[] nums) {
        int count = 1;
        int length = nums.length;

        for (int i = 1; i < length; ++i) {
            if (nums[i] != nums[i - 1]) {
                count = 1;
                continue;
            }

            if (++count > 2) {
                shiftElement(nums, i--);
                --length;
            }
        }

        return length;
    }
}
