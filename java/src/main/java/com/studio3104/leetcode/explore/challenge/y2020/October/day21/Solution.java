package com.studio3104.leetcode.explore.challenge.y2020.October.day21;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Deque<Integer> q = new ArrayDeque<>();

        for (int asteroid : asteroids) {
            if (asteroid > 0) {
                q.add(asteroid);
                continue;
            }

            while (!q.isEmpty() && q.peekLast() > 0 && q.peekLast() < Math.abs(asteroid)) {
                q.pollLast();
            }

            if (q.isEmpty() || q.peekLast() < 0) {
                q.add(asteroid);
            } else if (q.peekLast() == Math.abs(asteroid)) {
                q.pollLast();
            }
        }

        return q.stream().mapToInt(n -> n).toArray();
    }
}
