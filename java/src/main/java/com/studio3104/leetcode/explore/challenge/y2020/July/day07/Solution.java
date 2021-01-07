package com.studio3104.leetcode.explore.challenge.y2020.July.day07;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;

class Solution {
    List<Integer> findFirstIsland(int[][] grid) {
        List<Integer> position = new ArrayList<>();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    position = List.of(i, j);
                    break;
                }
            }
        }
        return position;
    }

    int incrementCount(int[][] grid, int x, int y, int count) {
        if (x == 0 || grid[x - 1][y] == 0) count++;
        if (y == 0 || grid[x][y - 1] == 0) count++;
        if (x == grid.length - 1 || grid[x + 1][y] == 0) count++;
        if (y == grid[0].length - 1 || grid[x][y + 1] == 0) count++;
        return count;
    }

    void updateStack(int[][] grid, int x, int y, Set<List<Integer>> visited, Stack<List<Integer>> stack) {
        Set<List<Integer>> toStack = new HashSet<>();

        if (x != 0 && grid[x - 1][y] == 1) toStack.add(List.of(x - 1, y));
        if (y != 0 && grid[x][y - 1] == 1) toStack.add(List.of(x, y - 1));
        if (x != grid.length - 1 && grid[x + 1][y] == 1) toStack.add(List.of(x + 1, y));
        if (y != grid[0].length - 1 && grid[x][y + 1] == 1) toStack.add(List.of(x, y + 1));

        for (List<Integer> target: toStack) {
            if (!visited.contains(target) && !stack.contains(target)) stack.push(target);
        }
    }

    int countPerimeter(int[][] grid) {
        int count = 0;
        Set<List<Integer>> visited = new HashSet<>();
        Stack<List<Integer>> stack = new Stack<>();

        List<Integer> firstIslandPosition = findFirstIsland(grid);
        stack.push(firstIslandPosition);

        while (!stack.empty()) {
            List<Integer> current = stack.pop();
            int x = current.get(0);
            int y = current.get(1);
            visited.add(current);

            count = incrementCount(grid, x, y, count);
            updateStack(grid, x, y, visited, stack);
        }

        return count;
    }

    public int islandPerimeter(int[][] grid) {
        return countPerimeter(grid);
    }
}
