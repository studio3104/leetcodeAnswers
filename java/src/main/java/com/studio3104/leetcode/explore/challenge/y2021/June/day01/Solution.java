package com.studio3104.leetcode.explore.challenge.y2021.June.day01;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;

class Solution {
    private void BFS(int n, int m, int[][] grid, Queue<List<Integer>> q, Set<List<Integer>> memo) {
        q.clear();
        q.add(List.of(n, m));

        while (!q.isEmpty()) {
            List<Integer> p = q.poll();
            if (memo.contains(p)) {
                continue;
            }

            int i = p.get(0);
            int j = p.get(1);

            if (i < 0 || j < 0 || i >= grid.length || j >= grid[i].length || grid[i][j] != 1) {
                continue;
            }

            memo.add(p);

            q.add(List.of(i + 1, j));
            q.add(List.of(i - 1, j));
            q.add(List.of(i, j + 1));
            q.add(List.of(i, j - 1));
        }
    }

    public int maxAreaOfIsland(int[][] grid) {
        int numIslands = 0;

        Set<List<Integer>> memo = new HashSet<>();
        Queue<List<Integer>> q = new ArrayDeque<>();

        for (int i = 0; i < grid.length; ++i) {
            for (int j = 0; j < grid[i].length; ++j) {
                int n = grid[i][j];

                if (n != 1 || memo.contains(List.of(i, j))) {
                    continue;
                }

                ++numIslands;
                BFS(i, j, grid, q, memo);
            }
        }

        return numIslands;
    }
}
