package com.studio3104.leetcode.explore.challenge.y2021.February.week2;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    private List<List<Integer>> identifyIsland(int[][] grid, Deque<List<Integer>> q, Set<List<Integer>> visited, List<Integer> offset) {
        List<List<Integer>> island = new ArrayList<>();

        while (!q.isEmpty()) {
            List<Integer> p = q.pollFirst();
            int y = p.get(0), x = p.get(1);

            if (visited.contains(p) || y < 0 || x < 0 || y >= grid.length || x >= grid[y].length || grid[y][x] == 0) {
                continue;
            }
            visited.add(p);
            island.add(List.of(y - offset.get(0), x - offset.get(1)));

            q.add(List.of(y + 1, x));
            q.add(List.of(y - 1, x));
            q.add(List.of(y, x + 1));
            q.add(List.of(y, x - 1));
        }

        return island;
    }

    public int numDistinctIslands(int[][] grid) {
        if (grid.length == 0 || grid[0].length == 0) {
            return 0;
        }

        // Traverse the grid to find islands,
        // while storing each position of land into a List to check each island's figure.
        // And put the List into a Set, the length of the Set would be the result.

        Set<List<List<Integer>>> distinctIslands = new HashSet<>();
        Set<List<Integer>> visited = new HashSet<>();
        Deque<List<Integer>> q = new ArrayDeque<>();

        for (int y = 0; y < grid.length; ++y) {
            for (int x = 0; x < grid[y].length; ++x) {
                List<Integer> p = List.of(y, x);
                if (grid[y][x] == 1 && !visited.contains(p)) {
                    q.add(p);
                    distinctIslands.add(identifyIsland(grid, q, visited, p));
                }
            }
        }

        return distinctIslands.size();
    }
}
