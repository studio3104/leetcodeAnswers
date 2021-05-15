package com.studio3104.leetcode.explore.challenge.y2021.May.week3;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;

class Solution {
    public int minKnightMoves(int x, int y) {
        if (x == 0 && y == 0) {
            return 0;
        }

        Set<List<Integer>> visited = new HashSet<>();
        Queue<List<Integer>> q = new ArrayDeque<>();
        q.add(List.of(0, 0, 0));

        int[][] offsets = new int[][]{{1, 2}, {2, 1}, {2, -1}, {1, -2}, {-1, -2}, {-2, -1}, {-2, 1}, {-1, 2}};

        while (!q.isEmpty()) {
            List<Integer> current = q.poll();
            int cx = current.get(0), cy = current.get(1), count = current.get(2);

            for (int[] offset : offsets) {
                int px = cx + offset[0], py = cy + offset[1];
                if (px == x && py == y) {
                    return count + 1;
                }

                List<Integer> p = List.of(px, py);
                if (visited.contains(p)) {
                    continue;
                }
                visited.add(p);

                q.add(List.of(px, py, count + 1));
            }
        }

        return -1;
    }
}
