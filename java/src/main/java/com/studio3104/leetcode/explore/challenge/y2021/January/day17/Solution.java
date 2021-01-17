package com.studio3104.leetcode.explore.challenge.y2021.January.day17;

class Solution {
    private int countVowelStrings(int n, int v, int[][] c) {
        if (n == 1) {
            return v;
        }
        if (v == 1) {
            return 1;
        }

        if (c[n][v] == 0) {
            c[n][v] = countVowelStrings(n - 1, v, c) + countVowelStrings(n, v - 1, c);
        }

        return c[n][v];
    }

    public int countVowelStrings(int n) {
        return countVowelStrings(n, 5, new int[n + 1][6]);
    }
}
