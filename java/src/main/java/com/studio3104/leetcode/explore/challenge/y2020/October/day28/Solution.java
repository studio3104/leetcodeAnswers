package com.studio3104.leetcode.explore.challenge.y2020.October.day28;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> summaryRanges(int[] nums) {
        if (nums.length == 0) {
            return List.of();
        }

        List<String> ranges = new ArrayList<>();

        int start = nums[0];
        int end = nums[0];

        for (int i = 1; i < nums.length; ++i) {
            int n = nums[i];

            if (end + 1 == n) {
                end = n;
                continue;
            }

            String range = start == end ? start + "" : start + "->" + end;
            ranges.add(range);

            start = n;
            end = n;
        }

        String range = start == end ? start + "" : start + "->" + end;
        ranges.add(range);

        return ranges;
    }
}
