package com.studio3104.leetcode.Problems.p0739DailyTemperatures;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {
    public int[] dailyTemperatures(int[] T) {
        int[] result = new int[T.length];
        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = T.length - 1; i >= 0; --i) {
            while (!deque.isEmpty() && T[i] >= T[deque.peekLast()]) {
                deque.pollLast();
            }

            if (!deque.isEmpty()) {
                result[i] = deque.peekLast() - i;
            }

            deque.add(i);
        }

        return result;
    }
}
