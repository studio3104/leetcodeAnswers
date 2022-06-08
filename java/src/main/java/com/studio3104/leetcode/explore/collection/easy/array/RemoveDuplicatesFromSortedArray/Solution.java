package com.studio3104.leetcode.explore.collection.easy.array.RemoveDuplicatesFromSortedArray;

class Solution {
    public int removeDuplicates(int[] nums) {
        int previous = Integer.MAX_VALUE;
        int k = 0;

        for (int i = 0; i < nums.length; ++i) {
            int n = nums[i];
            if (previous != n) {
                nums[k++] = n;
            }
            previous = n;
        }

        return k;
    }
}
