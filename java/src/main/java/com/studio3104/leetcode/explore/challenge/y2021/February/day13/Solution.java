package com.studio3104.leetcode.explore.challenge.y2021.February.day13;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        // Traverse the grid in 8 adjacent directions while noting the shortest distance that can be reached to the current position.
        // If the shortest distance than the current search route has already been recorded, the search will be terminated at that point,
        // otherwise overwrite it and continue.
        int len = grid.length;

        int[][] memo = new int[len][len];
        for (int[] m : memo) {
            Arrays.fill(m, Integer.MAX_VALUE);
        }

        Deque<int[]> q = new ArrayDeque<>();  // [y, x, distance]
        q.add(new int[]{0, 0, 1});

        while (!q.isEmpty()) {
            int[] c = q.pollLast();
            int y = c[0], x = c[1], distance = c[2];

            if (y < 0 || x < 0 || y >= grid.length || x >= grid.length) {
                continue;
            }
            if (grid[y][x] == 1 || memo[y][x] <= distance) {
                continue;
            }

            memo[y][x] = distance;

            for (int i = -1; i <= 1; ++i) {
                for (int j = -1; j <= 1; ++j) {
                    if (i == 0 && j == 0) {
                        continue;
                    }
                    q.addLast(new int[]{y + i, x + j, distance + 1});
                }
            }
        }

        // Return the value in the lower right corner when all the search is finished.
        // If the value has not been updated from the initial value, -1 is returned.
        int bottomRight = Math.abs(memo[len - 1][len - 1]);
        return bottomRight == Integer.MAX_VALUE ? -1 : bottomRight;
    }
}
