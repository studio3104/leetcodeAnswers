package com.studio3104.leetcode.explore.challenge.y2021.February.day23;

import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // Just perform BFS until it finds the target
        // Stop traversing if the current value is greater than the target

        Deque<int[]> q = new ArrayDeque<>();
        q.add(new int[]{0, 0});

        while (!q.isEmpty()) {
            int[] p = q.pollFirst();
            int m = p[0], n = p[1];
            if (m >= matrix.length || n >= matrix[m].length) {
                continue;
            }

            int current = matrix[m][n];
            if (current == target) {
                return true;
            }
            if (current > target) {
                continue;
            }

            q.addLast(new int[]{m, n + 1});
            q.addLast(new int[]{m + 1, n});
        }

        return false;
    }
}
