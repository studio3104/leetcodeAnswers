package com.studio3104.leetcode.explore.challenge.y2021.February.day04;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int findLHS(int[] nums) {
        // Count how many times each element appears
        Map<Integer, Integer> counter = new HashMap<>();

        for (int n : nums) {
            counter.put(n, counter.getOrDefault(n, 0) + 1);
        }

        // If a number matching the condition is included in the list,
        // the number of times it appears is summed up and the maximum value is updated.
        int longest = 0;

        for (int n : nums) {
            if (counter.containsKey(n + 1)) {
                longest = Math.max(longest, counter.get(n) + counter.get(n + 1));
            }
            if (counter.containsKey(n - 1)) {
                longest = Math.max(longest, counter.get(n) + counter.get(n - 1));
            }
        }

        return longest;
    }
}
