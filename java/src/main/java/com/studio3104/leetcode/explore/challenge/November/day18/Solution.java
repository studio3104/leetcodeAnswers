package com.studio3104.leetcode.explore.challenge.November.day18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

        List<int[]> merged = new ArrayList<>();
        merged.add(intervals[0]);

        for (int i = 1; i < intervals.length; ++i) {
            int[] currentInterval = intervals[i];
            int[] lastInterval = merged.get(merged.size() - 1);

            if (lastInterval[1] >= currentInterval[0]) {
                lastInterval[1] = Math.max(lastInterval[1], currentInterval[1]);
                continue;
            }

            merged.add(currentInterval);
        }

        return merged.toArray(new int[merged.size()][]);
    }
}
