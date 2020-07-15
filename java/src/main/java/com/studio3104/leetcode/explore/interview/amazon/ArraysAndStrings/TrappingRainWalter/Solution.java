package com.studio3104.leetcode.explore.interview.amazon.ArraysAndStrings.TrappingRainWalter;

public class Solution {
    public int trap(int[] height) {
        int[] left = new int[height.length];
        int maxHeight = 0;
        for (int i = 0; i < height.length; ++i) {
            maxHeight = Math.max(maxHeight, height[i]);
            left[i] = maxHeight;
        }

        int[] right = new int[height.length];
        maxHeight = 0;
        for (int i = height.length - 1; i >= 0; --i) {
            maxHeight = Math.max(maxHeight, height[i]);
            right[i] = maxHeight;
        }

        int trapped = 0;
        for (int i = 0; i < height.length; ++i) {
            trapped += Math.min(left[i], right[i]) - height[i];
        }

        return trapped;
    }
}
