package com.studio3104.leetcode.explore.challenge.September.day26;

public class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        if (timeSeries.length == 0) return 0;
        if (timeSeries.length == 1) return duration;

        int poisonedDuration = duration;
        for (int i = 1; i < timeSeries.length; ++i) {
            poisonedDuration += Math.min(duration, timeSeries[i] - timeSeries[i - 1]);
        }

        return poisonedDuration;
    }
}
