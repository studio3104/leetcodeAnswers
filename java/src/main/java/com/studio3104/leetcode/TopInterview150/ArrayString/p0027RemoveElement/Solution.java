package com.studio3104.leetcode.TopInterview150.ArrayString.p0027RemoveElement;

class Solution {
    public int removeElement(int[] nums, int val) {
        int count = 0;

        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] != val) {
                nums[count++] = nums[i];
            }
        }

        return count;
    }
}
