package com.studio3104.leetcode.explore.challenge.y2021.May.day19;

import java.util.Arrays;

class Solution {
    public int minMoves2(int[] nums) {
        int sum = Arrays.stream(nums).sum();
        int avg = sum / nums.length;
        return Arrays.stream(nums).reduce(0, (s, n) -> s + Math.abs(n - avg));
    }
}
