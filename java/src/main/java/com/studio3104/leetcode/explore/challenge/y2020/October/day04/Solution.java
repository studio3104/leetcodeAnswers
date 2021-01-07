package com.studio3104.leetcode.explore.challenge.y2020.October.day04;

import java.util.Arrays;

public class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        Arrays.sort(intervals, (o1, o2) -> o1[0] == o2[0] ? o2[1] - o1[1] : o1[0] - o2[0]);

        int numCovered = 0;
        int currentEnd;
        int previousEnd = 0;

        for (int[] interval: intervals) {
            currentEnd = interval[1];
            if (currentEnd <= previousEnd) continue;
            ++numCovered;
            previousEnd = currentEnd;
        }

        return numCovered;
    }
}
