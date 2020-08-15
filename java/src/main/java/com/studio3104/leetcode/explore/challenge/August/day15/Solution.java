package com.studio3104.leetcode.explore.challenge.August.day15;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));

        int previous = 0, answer = 0;
        for(int i = 1; i < intervals.length; ++i) {
            if (intervals[previous][1] <= intervals[i][0]) {
                previous = i;
                continue;
            }

            if (intervals[previous][1] > intervals[i][1]) previous = i;
            ++answer;
        }

        return answer;
    }
}
