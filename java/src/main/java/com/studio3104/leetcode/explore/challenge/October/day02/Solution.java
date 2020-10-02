package com.studio3104.leetcode.explore.challenge.October.day02;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    int target;
    int[] candidate;
    List<List<Integer>> combinations;

    private void backtrack(int remaining, int lastItem, List<Integer> combination) {
        if (remaining == 0) {
            combinations.add(combination);
            return;
        }

        if (remaining < 0 || remaining < lastItem) return;

        for (int c: candidate) {
            if (c < lastItem) continue;
            List<Integer> newCombination = new ArrayList<>(combination);
            newCombination.add(c);
            backtrack(remaining - c, c, newCombination);
        }
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        this.candidate = candidates;
        this.target = target;

        combinations = new ArrayList<>();
        backtrack(target, Integer.MIN_VALUE, new ArrayList<>());

        return combinations;
    }
}
