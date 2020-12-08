package com.studio3104.leetcode.explore.challenge.December.week2;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> findMissingRanges(int[] nums, int lower, int upper) {
        List<String> result = new ArrayList<>();

        if (nums.length == 0) {
            addResult(result, lower, upper);
            return result;
        }

        addResult(result, lower, nums[0] - 1);

        for (int i = 0; i < nums.length - 1; ++i) {
            addResult(result, nums[i] + 1, nums[i + 1] - 1);
        }

        addResult(result, nums[nums.length - 1] + 1, upper);
        return result;
    }

    public void addResult(List<String> result, int lower, int upper) {
        if (lower > upper) return;
        result.add(lower == upper ? String.valueOf(lower) : lower + "->" + upper);
    }
}
