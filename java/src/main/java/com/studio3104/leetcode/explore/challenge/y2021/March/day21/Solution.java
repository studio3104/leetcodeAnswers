package com.studio3104.leetcode.explore.challenge.y2021.March.day21;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution {
    private Map<Integer, Integer> countDigits(int n) {
        Map<Integer, Integer> counter = new HashMap<>();

        while (n >= 1) {
            int m = n % 10;
            n /= 10;
            counter.put(m, counter.getOrDefault(m, 0) + 1);
        }

        return counter;
    }

    public boolean reorderedPowerOf2(int N) {
        Set<Map<Integer, Integer>> variations = new HashSet<>();
        for (int n = 1; Math.log10(n) < Math.log10(N) + 1; n *= 2) {
            variations.add(countDigits(n));
        }
        return variations.contains(countDigits(N));
    }
}
