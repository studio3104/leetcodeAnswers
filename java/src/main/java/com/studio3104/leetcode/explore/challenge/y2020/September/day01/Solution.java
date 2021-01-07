package com.studio3104.leetcode.explore.challenge.y2020.September.day01;

import java.util.List;

public class Solution {
    // Damn...
    List<int[]> patterns = List.of(
            new int[]{0, 1, 2, 3}, new int[]{0, 1, 3, 2}, new int[]{0, 2, 1, 3}, new int[]{0, 2, 3, 1}, new int[]{0, 3, 1, 2}, new int[]{0, 3, 2, 1},
            new int[]{1, 0, 2, 3}, new int[]{1, 0, 3, 2}, new int[]{1, 2, 0, 3}, new int[]{1, 2, 3, 0}, new int[]{1, 3, 0, 2}, new int[]{1, 3, 2, 0},
            new int[]{2, 0, 1, 3}, new int[]{2, 0, 3, 1}, new int[]{2, 1, 0, 3}, new int[]{2, 1, 3, 0}, new int[]{2, 3, 0, 1}, new int[]{2, 3, 1, 0},
            new int[]{3, 0, 1, 2}, new int[]{3, 0, 2, 1}, new int[]{3, 1, 0, 2}, new int[]{3, 1, 2, 0}, new int[]{3, 2, 0, 1}, new int[]{3, 2, 1, 0}
    );

    public String largestTimeFromDigits(int[] A) {
        int largest = Integer.MIN_VALUE;
        int[] lp = null;

        for (int[] p: patterns) {
            int h = A[p[0]] * 10 + A[p[1]];
            int m = A[p[2]] * 10 + A[p[3]];
            if (h >= 24 || m >= 60) continue;

            int c = h * 100 + m;
            if (largest < c) {
                largest = c;
                lp = p;
            }
        }

        if (lp == null) return "";
        return "" + A[lp[0]] + A[lp[1]] + ":" + A[lp[2]] + A[lp[3]];
    }
}
