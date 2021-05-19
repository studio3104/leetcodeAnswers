package com.studio3104.leetcode.explore.challenge.y2021.May.day19;

import java.util.Arrays;

class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int head = 0;
        int tail = nums.length - 1;
        int moves = 0;

        while (head < tail) {
            moves += nums[tail--] - nums[head++];
        }

        return moves;
    }
}
