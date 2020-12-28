package com.studio3104.leetcode.explore.challenge.December.day28;

import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public int reachNumber(int target) {
        Deque<int[]> q = new ArrayDeque<>();
        q.add(new int[]{0, 0});
        int step = -1;

        while (!q.isEmpty()) {
            int[] t = q.pollFirst();
            int n = t[0];
            int s = t[1];

            if (n == target) {
                step = s;
                break;
            }

            ++s;
            q.add(new int[]{n + s, s});
            q.add(new int[]{n - s, s});
        }

        return step;
    }
}
