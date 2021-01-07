package com.studio3104.leetcode.explore.challenge.y2020.November.day28;

import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public void cleanDeque(int i, int k, int[] nums, Deque<Integer> deque) {
        if (!deque.isEmpty() && deque.getFirst() == i - k) {
            deque.removeFirst();
        }

        while (!deque.isEmpty() && nums[i] > nums[deque.getLast()]) {
            deque.removeLast();
        }
    }

    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums.length * k == 0) return new int[0];
        if (k == 1) return nums;

        Deque<Integer> deque = new ArrayDeque<>();
        int maxIndex = 0;

        for (int i = 0; i < k; i++) {
            cleanDeque(i, k, nums, deque);
            deque.addLast(i);

            if (nums[i] > nums[maxIndex]) {
                maxIndex = i;
            }
        }

        int[] output = new int[nums.length - k + 1];
        output[0] = nums[maxIndex];

        for (int i = k; i < nums.length; i++) {
            cleanDeque(i, k, nums, deque);
            deque.addLast(i);
            output[i - k + 1] = nums[deque.getFirst()];
        }

        return output;
    }
}
