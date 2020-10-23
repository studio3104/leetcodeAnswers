package com.studio3104.leetcode.explore.challenge.October.day23;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {
    public boolean find132pattern(int[] nums) {
        if (nums.length < 3) return false;

        int[] min = new int[nums.length];
        min[0] = nums[0];
        for (int i = 1; i < nums.length; ++i) {
            min[i] = Math.min(min[i - 1], nums[i]);
        }

        Deque<Integer> q = new ArrayDeque<>();
        for (int i = nums.length - 1; i >= 0; --i) {
            if (nums[i] <= min[i]) continue;

            while (!q.isEmpty() && q.peekLast() <= min[i]) {
                q.pollLast();
            }
            if (!q.isEmpty() && q.peekLast() < nums[i]) {
                return true;
            }

            q.add(nums[i]);
        }

        return false;
    }
}
