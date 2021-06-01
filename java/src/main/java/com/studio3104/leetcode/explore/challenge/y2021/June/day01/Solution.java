package com.studio3104.leetcode.explore.challenge.y2021.June.day01;

class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int maxArea = 0;

        for (int i = 0; i < grid.length; ++i) {
            for (int j = 0; j < grid[i].length; ++j) {
                if (grid[i][j] == 1) {
                    maxArea = Math.max(maxArea, DFS(grid, i, j));
                }
            }
        }

        return maxArea;
    }

    public int DFS(int[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[i].length || grid[i][j] == 0) {
            return 0;
        }

        grid[i][j] = 0;

        int area = 1;

        area += DFS(grid, i + 1, j);
        area += DFS(grid, i - 1, j);
        area += DFS(grid, i, j + 1);
        area += DFS(grid, i, j - 1);

        return area;
    }
}
