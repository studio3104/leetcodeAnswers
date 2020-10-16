package com.studio3104.leetcode.explore.challenge.October.day16;

public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0 || matrix[0].length == 0) return false;
        if (target < matrix[0][0] || target > matrix[matrix.length - 1][matrix[0].length - 1]) return false;

        int rowIndex = -1;
        int start = 0, end = matrix.length - 1;

        while (start <= end) {
            int p = (end + start) / 2;
            if (target >= matrix[p][0] && target <= matrix[p][matrix[0].length - 1]) {
                rowIndex = p;
                break;
            }

            if (target > matrix[p][0]) start = p + 1;
            else end = p - 1;
        }

        if (rowIndex == -1) return false;

        start = 0; end = matrix[rowIndex].length - 1;

        while (start <= end) {
            int p = (end + start) / 2;
            int n = matrix[rowIndex][p];

            if (n == target) return true;
            if (n < target) start = p + 1;
            else end = p - 1;
        }

        return false;
    }
}
