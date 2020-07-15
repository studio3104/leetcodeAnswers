package com.studio3104.leetcode.explore.interview.amazon.ArraysAndStrings.TrappingRainWalter;

public class givenUpSolution {
    public int trap(int[] height) {
        if (height == null || height.length == 0) return 0;

        int trap = 0;
        int stack = 0;

        int highestIndex = 0;
        int highest = height[highestIndex];

        while (highestIndex < height.length - 1) {
            if (height[highestIndex + 1] < highest) break;
            highest = height[++highestIndex];
        }

        int lowerTimes = 0;

        for (int i = highestIndex + 1; i < height.length; ++i) {
            if (height[i] >= highest) {
                trap += stack ;
                stack = 0;
                lowerTimes = 0;
                highest = height[i];
            } else {
                if (height[i] > height[i - 1]) {
                    int diff = lowerTimes * (highest - height[i]);
                    trap += stack - diff;
                    stack = stack - (stack - diff) + highest - height[i];
                } else {
                    ++lowerTimes;
                    stack += highest - height[i];
                }
            }
        }

        return trap;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.trap(new int[]{5, 4, 1, 1, 2});
        //solution.trap(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1});
        //solution.trap(new int[]{6, 8, 5, 0, 0, 6, 5});
    }
}
