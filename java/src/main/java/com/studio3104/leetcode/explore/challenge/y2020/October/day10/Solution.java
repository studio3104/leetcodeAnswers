package com.studio3104.leetcode.explore.challenge.y2020.October.day10;

import java.util.Arrays;

public class Solution {
    public int findMinArrowShots(int[][] points) {
        int length = points.length;
        if (length <= 1) return length;

        Arrays.sort(points, ((o1, o2) -> {
            int t = o1[0] == o2[0] ? 1 : 0;
            if (o1[t] == o2[t]) return 0;
            return o1[t] > o2[t] ? 1 : -1;
        }));

        int numArrows = 1;
        int[] s = points[0];

        for (int i = 1; i < length; ++i) {
            int[] p = points[i];
            if (s[1] < p[0]) {
                ++numArrows;
                s = p;
            } else {
                s[1] = Math.min(s[1], p[1]);
            }
        }

        return numArrows;
    }
}
