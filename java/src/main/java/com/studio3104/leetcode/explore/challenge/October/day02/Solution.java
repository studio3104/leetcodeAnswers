package com.studio3104.leetcode.explore.challenge.October.day02;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Solution {
    int target;
    int[] candidate;
    List<List<Integer>> combinations;

    private void backtrack(int remaining, Deque<Integer> combination) {
        if (remaining == 0) {
            combinations.add(new ArrayList<>(combination));
            return;
        }

        int lastItem = combination.size() > 0 ? combination.getLast() : Integer.MIN_VALUE;
        if (remaining < 0 || remaining < lastItem) return;

        for (int c: candidate) {
            if (c < lastItem) continue;
            combination.addLast(c);
            backtrack(remaining - c, combination);
            combination.pollLast();
        }
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        this.candidate = candidates;
        this.target = target;

        combinations = new ArrayList<>();
        backtrack(target, new ArrayDeque<>());

        return combinations;
    }
}
