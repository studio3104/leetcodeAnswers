package com.studio3104.leetcode.explore.challenge.y2021.March.day21;

import java.util.HashMap;
import java.util.Map;

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
        Map<Integer, Integer> target = countDigits(N);

        for (int n = 1; Math.log10(n) < Math.log10(N) + 1; n *= 2) {
            if (Math.floor(Math.log10(n)) != Math.floor(Math.log10(N))) {
                continue;
            }
            if (target.equals(countDigits(n))) {
                return true;
            }
        }
        return false;
    }
}
