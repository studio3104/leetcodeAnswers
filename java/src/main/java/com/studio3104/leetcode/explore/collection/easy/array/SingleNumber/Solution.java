package com.studio3104.leetcode.explore.collection.easy.array.SingleNumber;

import java.util.Arrays;

class Solution {
    public int singleNumber(int[] nums) {
        return Arrays.stream(nums).reduce(0, (a, b) -> a ^ b);
    }
}
