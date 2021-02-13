package com.studio3104.leetcode.explore.challenge.y2021.February.day13;

import java.util.Arrays;

class Solution {
    private void shortestPathBinaryMatrix(int[][] grid, int y, int x, int distance, int[][] memo) {
        if (y < 0 || x < 0 || y >= grid.length || x >= grid.length) {
            return;
        }
        if (grid[y][x] == 1 || memo[y][x] <= distance) {
            return;
        }

        memo[y][x] = distance;

        for (int i = -1; i <= 1; ++i) {
            for (int j = -1; j <= 1; ++j) {
                if (i == 0 && j == 0) {
                    continue;
                }
                shortestPathBinaryMatrix(grid, y + i, x + j, distance + 1, memo);
            }
        }
    }

    public int shortestPathBinaryMatrix(int[][] grid) {
        // Traverse the grid in 8 adjacent directions while noting the shortest distance that can be reached to the current position.
        // If the shortest distance than the current search route has already been recorded, the search will be terminated at that point,
        // otherwise overwrite it and continue.
        int len = grid.length;
        int[][] memo = new int[len][len];
        for (int[] m : memo) {
            Arrays.fill(m, Integer.MAX_VALUE);
        }
        shortestPathBinaryMatrix(grid, 0, 0, 1, memo);

        // Return the value in the lower right corner when all the search is finished.
        // If the value has not been updated from the initial value, -1 is returned.
        int bottomRight = Math.abs(memo[len - 1][len - 1]);
        return bottomRight == Integer.MAX_VALUE ? -1 : bottomRight;
    }
}
