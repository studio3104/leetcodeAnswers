package com.studio3104.leetcode.explore.challenge.july.day25;

public class Solution {
    public int findMin(int[] nums) {
        int i = 0, j = nums.length - 1;
        if (nums[i] < nums[j]) return nums[i];
        while (i < j) {
            if (nums[i] > nums[i + 1]) return nums[i + 1];
            if (nums[j] < nums[j - 1]) return nums[j];
            ++i; --j;
        }
        return nums[i];
    }
}
