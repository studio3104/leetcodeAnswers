package com.studio3104.leetcode.explore.challenge.y2020.December.day07;

class Solution {
    public int[][] generateMatrix(int n) {
        int[][] m = new int[n][n];

        int[] p = new int[]{0, -1};
        int[] d = new int[]{0, 1};

        for (int i = 1; i <= n * n; ++i) {
            p[0] += d[0];
            p[1] += d[1];
            m[p[0]][p[1]] = i;

            if (d[0] == 0 && d[1] == 1 && (p[1] + 1 >= n || m[p[0]][p[1] + 1] != 0)) {
                d[0] = 1;
                d[1] = 0;
            } else if (d[0] == 1 && (p[0] + 1 >= n || m[p[0] + 1][p[1]] != 0)) {
                d[0] = 0;
                d[1] = -1;
            } else if (d[0] == 0 && d[1] == -1 && (p[1] - 1 < 0 || m[p[0]][p[1] - 1] != 0)) {
                d[0] = -1;
                d[1] = 0;
            } else if (d[0] == -1 && (p[0] - 1 < 0 || m[p[0] - 1][p[1]] != 0)) {
                d[0] = 0;
                d[1] = 1;
            }
        }

        return m;
    }
}
