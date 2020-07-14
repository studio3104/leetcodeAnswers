package com.studio3104.leetcode.explore.interview.amazon.ArraysAndStrings.ContainerWithMostWater;

public class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int left = 0, right = height.length - 1;

        while (left < right) {
            int current = Math.min(height[left], height[right]) * (right - left);
            max = Math.max(max, current);
            if (height[left] < height[right]) left++;
            else right--;
        }

        return max;
    }
}
