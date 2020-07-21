package com.studio3104.leetcode.explore.challenge.july.day21;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    char[][] board;
    String word;
    Set<List<Integer>> visited;

    boolean DFS(int r, int c, int p) {
        if (p <= -1) return true;
        if (r < 0 || r >= board.length || c < 0 || c >= board[0].length) return false;
        if (word.charAt(p) != board[r][c]) return false;

        if (visited.contains(List.of(r, c))) return false;
        visited.add(List.of(r, c));

        boolean result = false;
        for (int[] o: new int[][]{{0, -1}, {-1, 0}, {0, 1}, {1, 0}}) {
            result = DFS(r + o[0], c + o[1], p - 1);
            if (result) break;
        }

        visited.remove(List.of(r, c));
        return result;
    }

    public boolean exist(char[][] board, String word) {
        this.board = board;
        this.word = word;
        this.visited = new HashSet<>();

        int p = word.length() - 1;
        for (int i = 0; i < board.length; ++i) {
            for (int j = 0; j < board[0].length; ++j) {
                if (DFS(i, j, p)) return true;
            }
        }

        return false;
    }
}
