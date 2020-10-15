package com.studio3104.leetcode.explore.challenge.October.day15;

public class Solution {
    private int rotate(int[] nums, int k, int start) {
        int temporary = nums[start];
        int next = k + start;
        if (next >= nums.length) next -= nums.length;
        int lowestIndex = next;

        while (next != start) {
            lowestIndex = Math.min(lowestIndex, next);

            int t = nums[next];
            nums[next] = temporary;
            temporary = t;

            next += k;
            while (next >= nums.length) next -= nums.length;
        }

        nums[start] = temporary;

        return lowestIndex;
    }

    public void rotate(int[] nums, int k) {
        int length = nums.length;
        if (k == 0 || length <= 1 || length == k) return;

        int lowestIndex = rotate(nums, k, 0);

        if (lowestIndex != 1) {
            for (int start = 1; start < lowestIndex; ++start) rotate(nums, k, start);
        }
    }
}
