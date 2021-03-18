package com.studio3104.leetcode.explore.challenge.y2021.March.day18;

import java.util.Stack;

class Solution {
    public int wiggleMaxLength(int[] nums) {
        if (nums.length <= 1) {
            return nums.length;
        }

        int i = 1;
        for (; i < nums.length; ++i) {
            if (nums[i - 1] != nums[i]) {
                break;
            }
        }

        if (i == nums.length) {
            return 1;
        }

        Stack<Integer> stack = new Stack<>();
        stack.add(nums[i - 1]);
        stack.add(nums[i]);

        boolean expectNextHigher = nums[i - 1] > nums[i];

        for (i = i + 1; i < nums.length; ++i) {
            int n = nums[i];
            int p = stack.peek();

            if (p == n) {
                continue;
            }

            if (p < n && expectNextHigher || p > n && !expectNextHigher) {
                stack.add(n);
                expectNextHigher = !expectNextHigher;
            }
        }

        return stack.size();
    }
}
