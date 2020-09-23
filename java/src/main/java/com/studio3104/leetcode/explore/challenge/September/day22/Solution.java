package com.studio3104.leetcode.explore.challenge.September.day22;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int[] counts = new int[2];
        Map<Integer, Integer> candidates = new HashMap<>();
        candidates.put(0, null);
        candidates.put(1, null);

        for (int num: nums) {
            if (candidates.get(0) != null && candidates.get(0) == num) ++counts[0];
            else if (candidates.get(1) != null && candidates.get(1) == num) ++counts[1];
            else if (counts[0] == 0) {
                ++counts[0];
                candidates.put(0, num);
            }
            else if (counts[1] == 0) {
                ++counts[1];
                candidates.put(1, num);
            }
            else {
                --counts[0];
                --counts[1];
            }
        }

        counts = new int[2];
        List<Integer> result = new ArrayList<>();

        for (int num: nums) {
            if (candidates.get(0) != null && candidates.get(0) == num) ++counts[0];
            if (candidates.get(1) != null && candidates.get(1) == num) ++counts[1];
        }

        if (counts[0] > nums.length / 3) result.add(candidates.get(0));
        if (counts[1] > nums.length / 3) result.add(candidates.get(1));

        return result;
    }
}
