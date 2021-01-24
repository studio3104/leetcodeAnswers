package com.studio3104.leetcode.explore.challenge.y2021.January.day23;

import java.util.HashMap;
import java.util.PriorityQueue;

class Solution {
    public int[][] diagonalSort(int[][] mat) {
        HashMap<Integer, PriorityQueue<Integer>> h = new HashMap<>();
        int m = mat.length, n = mat[0].length;

        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                h.putIfAbsent(i - j, new PriorityQueue<>());
                h.get(i - j).add(mat[i][j]);
            }
        }

        int[][] result = new int[m][n];

        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                result[i][j] = h.get(i - j).poll();
            }
        }

        return result;
    }
}
