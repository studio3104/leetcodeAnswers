package com.studio3104.leetcode.explore.challenge.y2020.August.week04;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    int[][] maze;
    int[] destination;

    final int[] UP = new int[]{-1, 0};
    final int[] DOWN = new int[]{1, 0};
    final int[] LEFT = new int[]{0, -1};
    final int[] RIGHT = new int[]{0, 1};

    boolean isWall(List<Integer> position) {
        return (
                position.get(0) < 0 ||
                position.get(1) < 0 ||
                position.get(0) >= maze.length ||
                position.get(1) >= maze[0].length ||
                maze[position.get(0)][position.get(1)] == 1
        );
    }

    boolean hasPath(List<Integer> current, int[] direction, Set<List<Integer>> marked) {
        if (marked.contains(current) || isWall(current)) return false;

        List<Integer> next = List.of(current.get(0) + direction[0], current.get(1) + direction[1]);
        if (!isWall(next)) return hasPath(next, direction, marked);
        if (current.get(0) == destination[0] && current.get(1) == destination[1]) return true;
        marked.add(current);

        return (
                hasPath(List.of(current.get(0) - 1, current.get(1)), UP, marked) ||
                hasPath(List.of(current.get(0) + 1, current.get(1)), DOWN, marked) ||
                hasPath(List.of(current.get(0), current.get(1) - 1), LEFT, marked) ||
                hasPath(List.of(current.get(0), current.get(1) + 1), RIGHT, marked)
        );
    }

    public boolean hasPath(int[][] maze, int[] start, int[] destination) {
        if (maze.length == 0 || maze[0].length == 0) return false;

        this.maze = maze;
        this.destination = destination;
        List<Integer> current = List.of(start[0], start[1]);

        return (
                hasPath(current, UP, new HashSet<>()) ||
                hasPath(current, DOWN, new HashSet<>()) ||
                hasPath(current, LEFT, new HashSet<>()) ||
                hasPath(current, RIGHT, new HashSet<>())
        );
    }
}
