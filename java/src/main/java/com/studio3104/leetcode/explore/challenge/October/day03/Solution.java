package com.studio3104.leetcode.explore.challenge.October.day03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public int findPairs(int[] nums, int k) {
        Map<Integer, List<Integer>> numbers = new HashMap<>();

        for (int i = 0; i < nums.length; ++i) {
            int num = nums[i];
            numbers.putIfAbsent(num, new ArrayList<>());
            numbers.get(num).add(i);
        }

        int numPairs = 0;

        for (int i = 0; i < nums.length; ++i) {
            int num = nums[i] + k;
            if (!numbers.containsKey(num)) continue;

            List<Integer> indexes = numbers.get(num);
            if (indexes.size() == 1 && indexes.get(0) == i) continue;

            numbers.remove(num);
            ++numPairs;
        }

        return numPairs;
    }
}
