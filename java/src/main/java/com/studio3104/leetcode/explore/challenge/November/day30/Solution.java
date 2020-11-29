package com.studio3104.leetcode.explore.challenge.November.day30;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean canReach(int[] arr, int start) {
        Set<Integer> visited = new HashSet<>();
        Deque<Integer> q = new ArrayDeque<>();

        q.add(start);

        while (!q.isEmpty()) {
            int current = q.pollFirst();
            visited.add(current);

            if (arr[current] == 0) {
                return true;
            }

            int forward = current + arr[current];
            if (forward < arr.length && !visited.contains(forward)) {
                q.add(forward);
            }

            int backward = current - arr[current];
            if (backward >= 0 && !visited.contains(backward)) {
                q.add(backward);
            }
        }

        return false;
    }
}
