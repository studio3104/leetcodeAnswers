package com.studio3104.leetcode.TopInterview150.ArrayString.p0167TwoSumIIInputArrayIsSorted;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> memo = new HashMap<>();

        for (int i = 0; i < numbers.length; ++i) {
            int n = numbers[i];
            if (memo.containsKey(target - n)) {
                return new int[]{memo.get(target - n) + 1, i + 1};
            }
            memo.put(n, i);
        }

        return new int[]{};
    }
}
