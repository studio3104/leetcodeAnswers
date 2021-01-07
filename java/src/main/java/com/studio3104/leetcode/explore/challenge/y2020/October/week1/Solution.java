package com.studio3104.leetcode.explore.challenge.y2020.October.week1;

import java.util.List;

public class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        int otherMin = Integer.MAX_VALUE, otherMax = Integer.MIN_VALUE;
        for (int n: arrays.get(0)) {
            otherMin = Math.min(otherMin, n);
            otherMax = Math.max(otherMax, n);
        }

        int distance = 0;

        for (int i = 1; i < arrays.size(); ++i) {
            int currentMin = Integer.MAX_VALUE, currentMax = Integer.MIN_VALUE;

            for (int n: arrays.get(i)) {
                currentMin = Math.min(currentMin, n);
                currentMax = Math.max(currentMax, n);
            }

            distance = Math.max(distance, Math.abs(otherMax - currentMin));
            distance = Math.max(distance, Math.abs(currentMax - otherMin));
            otherMin = Math.min(otherMin, currentMin);
            otherMax = Math.max(otherMax, currentMax);
        }

        return distance;
    }
}
