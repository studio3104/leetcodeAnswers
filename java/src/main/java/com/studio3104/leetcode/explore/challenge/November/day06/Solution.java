package com.studio3104.leetcode.explore.challenge.November.day06;

import java.util.Arrays;

class Solution {
    private int calculate(int[] nums, int divisor) {
        return Arrays.stream(nums).reduce(0, (sum, n) -> sum + (int) Math.ceil((float) n / divisor));
    }

    public int smallestDivisor(int[] nums, int threshold) {
        int divisor = 1;
        while (calculate(nums, divisor) > threshold) ++divisor;
        return divisor;
    }
}
