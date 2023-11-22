package com.studio3104.leetcode.TopInterview150.ArrayString.p0026RemoveDuplicatesFromSortedArray;

class Solution {
    public int removeDuplicates(int[] nums) {
        int previous = Integer.MAX_VALUE;
        int count = 0;

        for (int n : nums) {
            if (previous != n) {
                nums[count++] = n;
            }
            previous = n;
        }

        return count;
    }
}
