package com.studio3104.leetcode.explore.challenge.December.day28;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public int reachNumber(int target) {
        target = Math.abs(target);
        Set<List<Integer>> processed = new HashSet<>();
        Deque<List<Integer>> q = new ArrayDeque<>();
        q.add(List.of(0, 0));
        int step = -1;

        while (!q.isEmpty()) {
            List<Integer> t = q.pollFirst();
            int n = Math.abs(t.get(0));
            int s = t.get(1);

            if (n == target) {
                step = s;
                break;
            }

            if (processed.contains(List.of(n, s))) {
                continue;
            }
            processed.add(List.of(n, s));

            ++s;
            q.add(List.of(n + s, s));
            q.add(List.of(n - s, s));
        }

        return step;
    }
}
