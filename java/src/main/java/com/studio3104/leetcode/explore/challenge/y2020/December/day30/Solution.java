package com.studio3104.leetcode.explore.challenge.y2020.December.day30;

import java.util.ArrayList;
import java.util.List;

class Solution {
    private int countLivesAdjacentAround(int[][] board, int[] p) {
        int count = 0;

        for (int i = -1; i <= 1; ++i) {
            int y = p[0] + i;
            if (y < 0 || y >= board.length) {
                continue;
            }

            for (int j = -1; j <= 1; ++j) {
                int x = p[1] + j;
                if (p[0] == y && p[1] == x || x < 0 || x >= board[y].length) {
                    continue;
                }

                if (board[y][x] == 1) {
                    ++count;
                }
            }
        }

        return count;
    }

    private void checkUpdatePosition(int[][] board, List<int[]> toDie, List<int[]> toRevive) {
        for (int y = 0; y < board.length; ++y) {
            for (int x = 0; x < board[y].length; ++x) {
                int[] p = new int[]{y, x};
                int numLives = countLivesAdjacentAround(board, p);
                int cell = board[y][x];

                if (cell == 1 && (numLives < 2 || numLives > 3)) {
                    toDie.add(p);
                }
                if (cell == 0 && numLives == 3) {
                    toRevive.add(p);
                }
            }
        }
    }

    public void gameOfLife(int[][] board) {
        List<int[]> toDie = new ArrayList<>();
        List<int[]> toRevive = new ArrayList<>();
        checkUpdatePosition(board, toDie, toRevive);

        for (int[] p : toDie) {
            board[p[0]][p[1]] = 0;
        }
        for (int[] p : toRevive) {
            board[p[0]][p[1]] = 1;
        }
    }
}
