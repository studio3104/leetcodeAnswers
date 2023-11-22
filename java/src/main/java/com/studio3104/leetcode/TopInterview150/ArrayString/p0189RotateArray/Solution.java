package com.studio3104.leetcode.TopInterview150.ArrayString.p0189RotateArray;

class Solution {
    public void rotate(int[] nums, int k) {
        k %= nums.length;
        int count = 0;

        for (int start = 0; count < nums.length; ++start) {
            int current = start;
            int previous = nums[start];

            do {
                int next = (current + k) % nums.length;
                int temporary = nums[next];
                nums[next] = previous;
                previous = temporary;
                current = next;
                ++count;
            } while (start != current);
        }
    }
}
