package com.studio3104.leetcode.explore.challenge.y2020.October.day03;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int findPairs(int[] nums, int k) {
        Map<Integer, Integer> lastIndexOf = new HashMap<>();
        for (int i = 0; i < nums.length; ++i) lastIndexOf.put(nums[i], i);

        int numPairs = 0;

        for (int i = 0; i < nums.length; ++i) {
            int num = nums[i] + k;
            if (!lastIndexOf.containsKey(num) || lastIndexOf.get(num) == i) continue;
            lastIndexOf.remove(num);
            ++numPairs;
        }

        return numPairs;
    }
}
