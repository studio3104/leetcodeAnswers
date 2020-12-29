package com.studio3104.leetcode.explore.interview.amazon.ArraysAndStrings.SetMatrixZeroes;

import java.util.Arrays;

/*
Follow up:
- A straight forward solution using O(mn) space is probably a bad idea.
- A simple improvement uses O(m + n) space, but still not the best solution.
- Could you devise a constant space solution?
 */
class Solution {
    public void setZeroes(int[][] matrix) {
        boolean isColumn = false;

        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][0] == 0) {
                isColumn = true;
            }
            for (int j = 1; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }

        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[i].length; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        if (matrix[0][0] == 0) {
            Arrays.fill(matrix[0], 0);
        }

        if (isColumn) {
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}
