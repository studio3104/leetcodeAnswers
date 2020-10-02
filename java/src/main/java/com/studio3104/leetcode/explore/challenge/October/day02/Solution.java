package com.studio3104.leetcode.explore.challenge.October.day02;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Solution {
    int target;
    TreeSet<Integer> candidateSet;
    List<List<Integer>> combinations;

    private void backtrack(int remaining, List<Integer> combination) {
        if (remaining == 0) {
            combinations.add(new ArrayList<>(combination));
            return;
        }

        int lastItem = combination.get(combination.size() - 1);
        if (remaining < 0 || remaining < lastItem) return;

        for (int c: candidateSet) {
            if (c < lastItem) continue;
            List<Integer> newCombination = new ArrayList<>(combination);
            newCombination.add(c);
            backtrack(remaining - c, newCombination);
        }
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        this.target = target;
        candidateSet = new TreeSet<>();
        for (int c: candidates) candidateSet.add(c);
        combinations = new ArrayList<>();

        for (int c: candidateSet) {
            int remaining = target - c;
            if (remaining < 0) continue;
            if (remaining == 0) combinations.add(List.of(c));
            else backtrack(remaining, new ArrayList<>(List.of(c)));
        }

        return combinations;
    }
}
