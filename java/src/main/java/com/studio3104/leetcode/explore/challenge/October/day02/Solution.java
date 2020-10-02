package com.studio3104.leetcode.explore.challenge.October.day02;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Solution {
    int target;
    int[] candidates;
    List<List<Integer>> combinations;

    private void backtrack(int remaining, int processedIndex, Deque<Integer> combination) {
        if (remaining == 0) {
            combinations.add(new ArrayList<>(combination));
            return;
        }

        if (remaining < 0) return;

        for (int i = processedIndex; i < candidates.length; ++i) {
            int c = candidates[i];
            combination.addLast(c);
            backtrack(remaining - c, i, combination);
            combination.pollLast();
        }
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        this.candidates = candidates;
        this.target = target;

        combinations = new ArrayList<>();
        backtrack(target, 0, new ArrayDeque<>());

        return combinations;
    }
}
