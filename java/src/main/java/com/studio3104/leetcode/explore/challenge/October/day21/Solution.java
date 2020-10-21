package com.studio3104.leetcode.explore.challenge.October.day21;

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

            boolean isDisappeared = false;

            while (!q.isEmpty() && q.peekLast() > 0) {
                int qa = q.pollLast();
                if (qa > Math.abs(asteroid)) q.add(qa);
                if (qa >= Math.abs(asteroid)) {
                    isDisappeared = true;
                    break;
                }
            }

            if (!isDisappeared) q.add(asteroid);
        }

        return q.stream().mapToInt(n -> n).toArray();
    }
}
