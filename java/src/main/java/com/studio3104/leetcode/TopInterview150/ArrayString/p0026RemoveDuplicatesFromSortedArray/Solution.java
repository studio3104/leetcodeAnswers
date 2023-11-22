package com.studio3104.leetcode.TopInterview150.ArrayString.p0026RemoveDuplicatesFromSortedArray;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> memo = new HashSet<>();
        int count = 0;

        for (int i = 0; i < nums.length; ++i) {
            int n = nums[i];
            if (memo.contains(n)) {
                continue;
            }

            memo.add(n);
            nums[count++] = n;
        }

        return count;
    }
}
