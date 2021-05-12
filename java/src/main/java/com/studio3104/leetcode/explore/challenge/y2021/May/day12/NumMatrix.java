package com.studio3104.leetcode.explore.challenge.y2021.May.day12;

class NumMatrix {
    private final int[][] sums;

    public NumMatrix(int[][] matrix) {
        sums = new int[matrix.length + 1][matrix[0].length + 1];

        for (int i = matrix.length - 1; i >= 0; --i) {
            int rowSum = 0;

            for (int j = matrix[i].length - 1; j >= 0; --j) {
                rowSum += matrix[i][j];
                sums[i][j] = rowSum + sums[i + 1][j];
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        return sums[row1][col1] - sums[row2 + 1][col1] - sums[row1][col2 + 1] + sums[row2 + 1][col2 + 1];
    }
}
