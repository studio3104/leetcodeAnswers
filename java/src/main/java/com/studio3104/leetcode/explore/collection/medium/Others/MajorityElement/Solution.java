package com.studio3104.leetcode.explore.collection.medium.Others.MajorityElement;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> c = new HashMap<>();
        int answer = 0;
        for (int n: nums) {
            c.put(n, c.getOrDefault(n, 0) + 1);
            if (c.get(n) > nums.length / 2) {
                answer = n;
                break;
            }
        }
        return answer;
    }
}
