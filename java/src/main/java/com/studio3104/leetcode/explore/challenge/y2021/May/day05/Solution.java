package com.studio3104.leetcode.explore.challenge.y2021.May.day05;

import java.util.Arrays;

class Solution {
    private void traverse(int[] nums, int index, int step, int[] mark) {
        if (index < 0 || index >= nums.length || step >= mark[index]) {
            return;
        }
        mark[index] = step;

        for (int i = index + nums[index]; i > index; --i) {
            traverse(nums, i, step + 1, mark);
        }
    }

    public int jump(int[] nums) {
        int[] mark = new int[nums.length];
        Arrays.fill(mark, Integer.MAX_VALUE);

        traverse(nums, 0, 0, mark);

        return mark[mark.length - 1];
    }
}
