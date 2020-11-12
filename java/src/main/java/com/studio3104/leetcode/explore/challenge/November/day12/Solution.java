package com.studio3104.leetcode.explore.challenge.November.day12;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    private void backtrack(Deque<Integer> combinations, int length, Map<Integer, Integer> counter, List<List<Integer>> result) {
        if (combinations.size() == length) {
            result.add(new ArrayList<>(combinations));
            return;
        }

        for (int num : counter.keySet()) {
            int count = counter.get(num);
            if (count == 0) continue;

            combinations.addLast(num);
            counter.put(num, count - 1);

            backtrack(combinations, length, counter, result);

            combinations.removeLast();
            counter.put(num, count);
        }
    }

    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        Map<Integer, Integer> counter = new HashMap<>();
        for (int num : nums) {
            counter.put(num, counter.getOrDefault(num, 0) + 1);
        }

        Deque<Integer> combinations = new ArrayDeque<>();
        backtrack(combinations, nums.length, counter, result);

        return result;
    }
}
