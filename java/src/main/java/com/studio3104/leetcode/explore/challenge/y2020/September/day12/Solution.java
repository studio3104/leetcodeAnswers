package com.studio3104.leetcode.explore.challenge.y2020.September.day12;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    private void backtrack(int k, int remain, LinkedList<Integer> combination, int next, List<List<Integer>> result) {
        if (remain == 0 && combination.size() == k) {
            result.add(new ArrayList<>(combination));
            return;
        }
        if (remain < 0 || combination.size() == k) return;

        for (int i = next; i < 9; ++i) {
            int n = i + 1;
            combination.add(n);
            backtrack(k, remain - n, combination, n, result);
            combination.removeLast();
        }
    }

    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        LinkedList<Integer> combination = new LinkedList<>();
        backtrack(k, n, combination, 0, result);
        return result;
    }
}
