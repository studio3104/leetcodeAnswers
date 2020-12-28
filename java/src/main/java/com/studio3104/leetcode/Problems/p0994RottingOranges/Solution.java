package com.studio3104.leetcode.Problems.p0994RottingOranges;

import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    private void initialize(int[][] grid, Deque<int[]> q) {
        for (int i = 0; i < grid.length; ++i) {
            for (int j = 0; j < grid[0].length; ++j) {
                if (grid[i][j] == 2) {
                    q.add(new int[]{i, j, 0});
                }
                if (grid[i][j] == 1 || grid[i][j] == 2) {
                    grid[i][j] = Integer.MAX_VALUE;
                }
            }
        }
    }

    private int getMinimumMin(int[][] grid) {
        int m = 0;

        for (int[] ints : grid) {
            for (int j = 0; j < grid[0].length; ++j) {
                int n = ints[j];
                if (n == Integer.MAX_VALUE) {
                    return -1;
                }
                m = Math.max(m, n);
            }
        }

        return m;
    }

    public int orangesRotting(int[][] grid) {
        Deque<int[]> q = new ArrayDeque<>();
        initialize(grid, q);

        while (!q.isEmpty()) {
            int[] p = q.poll();
            int i = p[0], j = p[1];
            int minutes = p[2];

            if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] <= minutes) {
                continue;
            }

            grid[i][j] = minutes++;

            q.add(new int[]{i - 1, j, minutes});
            q.add(new int[]{i + 1, j, minutes});
            q.add(new int[]{i, j - 1, minutes});
            q.add(new int[]{i, j + 1, minutes});
        }

        return getMinimumMin(grid);
    }
}
