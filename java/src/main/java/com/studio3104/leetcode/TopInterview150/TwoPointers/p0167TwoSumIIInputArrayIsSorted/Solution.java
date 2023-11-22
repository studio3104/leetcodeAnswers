package com.studio3104.leetcode.TopInterview150.TwoPointers.p0167TwoSumIIInputArrayIsSorted;

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int low = 0;
        int high = numbers.length - 1;

        while (low < high) {
            int sum = numbers[low] + numbers[high];

            if (sum == target) {
                return new int[]{low + 1, high + 1};
            }

            if (sum < target) {
                ++low;
            } else {
                --high;
            }
        }

        return new int[]{};
    }
}
