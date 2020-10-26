package com.studio3104.leetcode.explore.challenge.October.day26;

class Solution {
    public double champagneTower(int poured, int query_row, int query_glass) {
        double[] currentLevel = new double[]{poured};

        for (int i = 1; i <= query_row; ++i) {
            double[] nextLevel = new double[i + 1];

            for (int j = 0; j < currentLevel.length; ++j) {
                double excess = currentLevel[j] - 1;
                if (excess <= 0) continue;

                double carry = excess / 2;
                nextLevel[j] += carry;
                nextLevel[j + 1] += carry;
            }

            currentLevel = nextLevel;
        }

        return Math.min(1, currentLevel[query_glass]);
    }
}
