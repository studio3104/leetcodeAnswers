package com.studio3104.leetcode.Problems.p0056MergeIntervals;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;

public class Solution {
    private static class IntervalComparator implements Comparator<int[]> {
        @Override
        public int compare(int[] o1, int[] o2) {
            if (o1[0] < o2[0]) return -1;
            return o1[0] == o2[0] ? 0 : 1;
        }
    }

    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, new IntervalComparator());

        LinkedList<int[]> merged = new LinkedList<>();
        for (int[] interval: intervals) {
            if (merged.isEmpty() || interval[0] > merged.getLast()[1]) {
                merged.add(interval);
            } else {
                merged.getLast()[1] = Math.max(merged.getLast()[1], interval[1]);
            }
        }

        return merged.toArray(new int[merged.size()][]);
    }
}
