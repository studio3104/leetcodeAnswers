package com.studio3104.leetcode.explore.interview.amazon.NumberOfIslands;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    char[][] grid;
    Set<List<Integer>> visited;

    private void BFS(int i, int j) {
        if (
                i < 0 || i >= grid.length || j < 0 || j >= grid[0].length ||
                visited.contains(List.of(i, j)) || grid[i][j] != '1'
        ) {
            return;
        }

        visited.add(List.of(i, j));
        BFS(i + 1, j);
        BFS(i - 1, j);
        BFS(i, j + 1);
        BFS(i, j - 1);
    }

    public int numIslands(char[][] grid) {
        this.grid = grid;
        visited = new HashSet<>();
        int numOfIslands = 0;

        for (int i = 0; i < grid.length; ++i) {
            for (int j = 0; j < grid[0].length; ++j) {
                if (grid[i][j] == '1' && !visited.contains(List.of(i, j))) {
                    ++numOfIslands;
                    BFS(i, j);
                }
            }
        }

        return numOfIslands;
    }
}
