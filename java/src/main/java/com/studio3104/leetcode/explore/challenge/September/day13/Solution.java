package com.studio3104.leetcode.explore.challenge.September.day13;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> r = new ArrayList<>();
        boolean isInDuration = false;
        boolean usedNew = false;
        int[] d = new int[]{Integer.MAX_VALUE, Integer.MIN_VALUE};
        int lastEnd = Integer.MAX_VALUE;

        for (int[] i: intervals) {
            if (!usedNew && !isInDuration && (newInterval[0] <= i[0] || newInterval[0] <= i[1])) {
                if (newInterval[1] < i[0]) {
                    r.add(newInterval);
                    usedNew = true;
                } else {
                    isInDuration = true;
                    d[0] = Math.min(newInterval[0], i[0]);
                }
            }

            if (!isInDuration) {
                r.add(i);
                continue;
            }

            if (i[0] <= newInterval[1] && i[1] >= newInterval[1]) {
                d[1] = Math.max(newInterval[1], i[1]);
            } else if (i[0] >= newInterval[1] && lastEnd < newInterval[1]) {
                d[1] = newInterval[1];
                r.add(d);
                d = i;
            }

            if (d[1] != Integer.MIN_VALUE) {
                r.add(d);
                isInDuration = false;
                usedNew = true;
            }

            lastEnd = i[1];
        }

        if (!usedNew) {
            if (d[0] == Integer.MAX_VALUE) r.add(newInterval);
            else {
                d[1] = Math.max(newInterval[1], intervals[intervals.length - 1][1]);
                r.add(d);
            }
        }

        int[][] result = new int[r.size()][2];
        for (int i = 0; i < r.size(); ++i) result[i] = r.get(i);
        return result;
    }
}
