package com.studio3104.leetcode.Problems.p0252MeetingRooms;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public boolean canAttendMeetings(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));
        for (int i = 0; i < intervals.length - 1; ++i) {
            if (intervals[i][1] > intervals[i + 1][0]) return false;
        }
        return true;
    }
}
