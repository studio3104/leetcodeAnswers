package com.studio3104.leetcode.explore.challenge.y2021.February.day23;

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = 0, n = matrix[0].length - 1;

        while (n >= 0 && m < matrix.length) {
            int current = matrix[m][n];

            if (current == target) {
                return true;
            }

            if (current > target) {
                --n;
            } else {
                ++m;
            }
        }

        return false;
    }
}
