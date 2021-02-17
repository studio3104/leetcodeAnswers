package com.studio3104.leetcode.explore.challenge.y2021.February.day17;

class Solution {
    public int maxArea(int[] height) {
        // Calculate the amount of water between 2 points that are initially the head (0) and the tail (length - 1)
        // Increment the head if the tail is greater than the head, otherwise decrement the tail
        // Continue iteration while the index of the tail is greater than the head's

        int max = 0;
        int headIndex = 0;
        int tailIndex = height.length - 1;

        while (headIndex < tailIndex) {
            int head = height[headIndex];
            int tail = height[tailIndex];

            max = Math.max(max, Math.min(head, tail) * (tailIndex - headIndex));

            if (head < tail) {
                ++headIndex;
            } else {
                --tailIndex;
            }
        }

        return max;
    }
}
