package com.studio3104.leetcode.explore.challenge.y2021.March.day13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    private int traverse(int n, Map<Integer, Integer> memo, Map<Integer, List<int[]>> v) {
        if (memo.containsKey(n)) {
            return memo.get(n);
        }

        memo.put(n, 1 + v.get(n).stream()
                .mapToInt(a -> traverse(a[0], memo, v) * traverse(a[1], memo, v))
                .sum()
        );

        return memo.get(n);
    }

    public int numFactoredBinaryTrees(int[] arr) {
        Map<Integer, List<int[]>> v = new HashMap<>();
        for (int n : arr) {
            v.put(n, new ArrayList<>());
        }

        for (int n : arr) {
            for (int m : arr) {
                int d = n / m;
                if (n % m == 0 && v.containsKey(d)) {
                    v.get(n).add(new int[]{m, d});
                }
            }
        }

        Map<Integer, Integer> memo = new HashMap<>();
        return Arrays.stream(arr)
                .map(n -> traverse(n, memo, v))
                .sum() % (int) (Math.pow(10, 9) + 7);
    }
}
