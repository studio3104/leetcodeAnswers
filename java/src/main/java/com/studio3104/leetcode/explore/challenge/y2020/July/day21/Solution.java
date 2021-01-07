package com.studio3104.leetcode.explore.challenge.y2020.July.day21;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    char[][] board;
    String word;
    Set<List<Integer>> visited;

    boolean DFS(int r, int c, int p) {
        if (p >= word.length()) return true;
        if (r < 0 || r >= board.length || c < 0 || c >= board[0].length) return false;
        if (word.charAt(p) != board[r][c]) return false;

        if (visited.contains(List.of(r, c))) return false;
        visited.add(List.of(r, c));

        for (int[] o: new int[][]{{0, -1}, {-1, 0}, {0, 1}, {1, 0}}) {
            if (DFS(r + o[0], c + o[1], p + 1)) return true;
        }

        visited.remove(List.of(r, c));
        return false;
    }

    public boolean exist(char[][] board, String word) {
        this.board = board;
        this.word = word;
        this.visited = new HashSet<>();

        for (int i = 0; i < board.length; ++i) {
            for (int j = 0; j < board[0].length; ++j) {
                if (DFS(i, j, 0)) return true;
            }
        }

        return false;
    }
}
