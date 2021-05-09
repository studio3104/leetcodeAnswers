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
            int sub = sum - n * 2;
            if (sub >= 0) {
                return false;
            }

            q.add(Math.abs(sub));
            sum = sum - n + Math.abs(sub);
        }

        return true;
    }
}
