package com.studio3104.leetcode.explore.challenge.September.day28;

public class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int topSubarray = 0;
        int product = 1;
        int numSubarray = 0;

        for (int i = 0; i < nums.length; ++i) {
            int num = nums[i];

            if (num >= k) {
                product = 1;
                topSubarray = i + 1;
                continue;
            }

            ++numSubarray;
            product *= num;
            if (i == topSubarray) continue;

            do {
                if (product < k) {
                    numSubarray += i - topSubarray;
                    break;
                }
                product /= nums[topSubarray++];
            } while (topSubarray <= i);
        }

        return numSubarray;
    }
}
