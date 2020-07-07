package com.studio3104.leetcode.explore.challenge.july.day07;

public class Solution2 {
    public int islandPerimeter(int[][] grid) {
        int count = 0;
        int x = grid.length, y = grid[0].length;

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (grid[i][j] == 0) continue;
                if (i == 0 || grid[i - 1][j] == 0) count++;
                if (j == 0 || grid[i][j - 1] == 0) count++;
                if (i + 1 == x || grid[i + 1][j] == 0) count++;
                if (j + 1 == y || grid[i][j + 1] == 0) count++;
            }
        }
        return count;
    }

    public int islandPerimeter2(int[][] grid) {
        int count = 0;
        int x = grid.length, y = grid[0].length;

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (grid[i][j] == 0) continue;
                count += 4;
                if (i > 0 && grid[i - 1][j] == 1) count -= 2;
                if (j > 0 && grid[i][j - 1] == 1) count -= 2;
            }
        }
        return count;
    }
}
