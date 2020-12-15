package com.studio3104.leetcode.explore.challenge.December.day15;

class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] squares = new int[nums.length];
        int p = squares.length - 1;
        int head = 0;
        int tail = p;

        while (p >= 0) {
            squares[p--] = (int) (Math.abs(nums[head]) > Math.abs(nums[tail]) ? Math.pow(nums[head++], 2) : Math.pow(nums[tail--], 2));
        }

        return squares;
    }
}
