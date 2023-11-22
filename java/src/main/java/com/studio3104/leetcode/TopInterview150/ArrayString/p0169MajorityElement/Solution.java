package com.studio3104.leetcode.TopInterview150.ArrayString.p0169MajorityElement;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int majorityElement(int[] nums) {
        int majority = 0;
        Map<Integer, Integer> memo = new HashMap<>();

        for (int n : nums) {
            memo.put(n, memo.getOrDefault(n, 0) + 1);

            if (memo.get(n) > nums.length / 2) {
                majority = n;
                break;
            }
        }

        return majority;
    }
}
