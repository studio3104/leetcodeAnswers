package com.studio3104.leetcode.explore.challenge.October.day03;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int findPairs(int[] nums, int k) {
        Map<Integer, Integer> numbers = new HashMap<>();
        for (int i = 0; i < nums.length; ++i) numbers.put(nums[i], i);

        int numPairs = 0;

        for (int i = 0; i < nums.length; ++i) {
            int num = nums[i] + k;
            if (!numbers.containsKey(num) || numbers.get(num) == i) continue;
            numbers.remove(num);
            ++numPairs;
        }

        return numPairs;
    }
}
