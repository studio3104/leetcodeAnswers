package com.studio3104.leetcode.explore.interview.amazon.TwoSum;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> indexes = new HashMap<>();
        for (int i = 0; i < nums.length; ++i) indexes.put(nums[i], i);
        for (int i = 0; i < nums.length; ++i) {
            int sub = target - nums[i];
            if (indexes.containsKey(sub) && indexes.get(sub) != i) {
                return new int[]{i, indexes.get(sub)};
            }
        }
        return new int[]{Integer.MIN_VALUE, Integer.MIN_VALUE};
    }
}
