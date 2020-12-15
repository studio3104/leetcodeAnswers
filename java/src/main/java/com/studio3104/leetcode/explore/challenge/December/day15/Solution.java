package com.studio3104.leetcode.explore.challenge.December.day15;

class Solution {
    public int[] sortedSquares(int[] nums) {
        int head = 0;
        int tail = nums.length - 1;

        int[] squares = new int[nums.length];

        for (int p = tail; p >= 0; --p) {
            squares[p] = (int) (Math.abs(nums[head]) > Math.abs(nums[tail]) ? Math.pow(nums[head++], 2) : Math.pow(nums[tail--], 2));
        }

        return squares;
    }
}
