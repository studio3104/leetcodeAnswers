package com.studio3104.leetcode.explore.challenge.December.day17;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        int count = 0;
        Map<Integer, Integer> m = new HashMap<>();

        for (int a : A) {
            for (int b : B) {
                m.put(a + b, m.getOrDefault(a + b, 0) + 1);
            }
        }

        for (int c : C) {
            for (int d : D) {
                count += m.getOrDefault((c + d) * -1, 0);
            }
        }

        return count;
    }
}
