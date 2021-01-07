package com.studio3104.leetcode.explore.challenge.y2020.October.day08;

public class Solution {
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length;

        while (left < right) {
            int i = left + (right - left) / 2;
            if (nums[i] == target) return i;
            if (nums[i] < target) left = i + 1;
            else right = i;
        }

        return -1;
    }
}
