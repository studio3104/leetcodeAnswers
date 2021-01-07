package com.studio3104.leetcode.explore.challenge.y2020.October.day30;

import java.util.Arrays;

class Solution {
    public int findNumberOfLIS(int[] nums) {
        if (nums.length <= 1) return nums.length;

        int[] longestAt = new int[nums.length];
        int[] longestCountAt = new int[nums.length];
        Arrays.fill(longestAt, 1);
        Arrays.fill(longestCountAt, 1);

        int maxLength = 0;
        int maxLengthCount = 0;

        for (int i = 0; i < nums.length; ++i) {
            for (int j = 0; j < i; ++j) {
                if (nums[i] <= nums[j]) continue;

                if (longestAt[i] == longestAt[j] + 1) {
                    longestCountAt[i] += longestCountAt[j];
                }
                if (longestAt[i] <= longestAt[j]) {
                    longestCountAt[i] = longestCountAt[j];
                    longestAt[i] = longestAt[j] + 1;
                }
            }

            if (longestAt[i] == maxLength) {
                maxLengthCount += longestCountAt[i];
            }
            if (longestAt[i] > maxLength) {
                maxLength = longestAt[i];
                maxLengthCount = longestCountAt[i];
            }
        }

        return maxLengthCount;
    }
}
