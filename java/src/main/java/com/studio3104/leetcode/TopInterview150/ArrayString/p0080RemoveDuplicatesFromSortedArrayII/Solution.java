package com.studio3104.leetcode.TopInterview150.ArrayString.p0080RemoveDuplicatesFromSortedArrayII;

class Solution {
    public int removeDuplicates(int[] nums) {
        int count = 0;
        int series = 1;
        int previous = Integer.MAX_VALUE;

        for (int n : nums) {
            if (n == previous) {
                if (++series > 2) {
                    continue;
                }
            } else {
                series = 1;
            }

            nums[count++] = n;
            previous = n;
        }

        return count;
    }
}
