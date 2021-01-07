package com.studio3104.leetcode.explore.challenge.y2020.September.day14;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    private int[] nums;
    private final Map<Integer, Integer> memo = new HashMap<>();

    private int rob(int index) {
        if (index >= nums.length) return 0;
        if (memo.containsKey(index)) return memo.get(index);

        int result = Math.max(
                rob(index + 2) + nums[index],
                rob(index + 3) + nums[index]
        );
        memo.put(index, result);
        return result;
    }

    public int rob(int[] nums) {
        this.nums = nums;
        return Math.max(rob(0), rob(1));
    }
}
