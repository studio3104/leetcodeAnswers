package com.studio3104.leetcode.explore.challenge.y2021.January.day21;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.stream.IntStream;

class Solution {
    public int[] mostCompetitive(int[] nums, int k) {
        Deque<Integer> q = new ArrayDeque<>();
        int remain = nums.length - k;

        for (int n : nums) {
            if (remain == 0 && q.size() == k) {
                break;
            }

            while (!q.isEmpty() && q.peekLast() > n && remain > 0) {
                q.pollLast();
                --remain;
            }
            q.addLast(n);
        }

        return IntStream.range(0, k).map(n -> q.pollFirst()).toArray();
    }
}
