package com.studio3104.leetcode.explore.collection.easy.array.RotateArray;

class Solution {
    void reverse(int[] nums, int from, int to) {
        while (from < to) {
            int temporary = nums[from];
            nums[from] = nums[to];
            nums[to] = temporary;
            from++; to--;
        }
    }

    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }
}
