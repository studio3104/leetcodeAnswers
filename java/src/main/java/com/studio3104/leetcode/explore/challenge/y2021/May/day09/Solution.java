package com.studio3104.leetcode.explore.challenge.y2021.May.day09;

import java.util.PriorityQueue;

class Solution {
    public boolean isPossible(int[] target) {
        PriorityQueue<Integer> q = new PriorityQueue<>((a, b) -> b - a);
        int sum = 0;
        for (int n : target) {
            sum += n;
            q.add(n);
        }

        while (!q.isEmpty() && q.peek() != 1) {
            int n = q.poll();
            int sub = sum - n;
            if (sub == 1) {
                return true;
            }

            int m = n % sub;
            if (m == 0 || m == n) {
                return false;
            }

            q.add(m);
            sum = sum - n + m;
        }

        return true;
    }
}
