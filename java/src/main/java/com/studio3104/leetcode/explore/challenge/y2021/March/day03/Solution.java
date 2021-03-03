package com.studio3104.leetcode.explore.challenge.y2021.March.day03;

import java.util.Arrays;

class Solution {
    public int missingNumber(int[] nums) {
        int len = nums.length;
        return len * (len + 1) / 2 - Arrays.stream(nums).sum();
    }
}
