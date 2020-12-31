package com.studio3104.leetcode.explore.collection.medium.DP.JumpGame;

import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public boolean canJump(int[] nums) {
        boolean[] reached = new boolean[nums.length];
        Deque<Integer> q = new ArrayDeque<>();
        q.add(0);

        while (!q.isEmpty()) {
            int i = q.pollFirst();
            reached[i] = true;

            if (i == nums.length - 1) {
                break;
            }

            for (int p = nums[i] + i; p > i; --p) {
                if (p < reached.length && !reached[p]) {
                    q.add(p);
                }
            }
        }

        return reached[reached.length - 1];
    }
}
