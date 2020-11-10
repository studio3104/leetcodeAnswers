package com.studio3104.leetcode.explore.challenge.November.day10;

class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        for (int i = 0; i < A.length; ++i) {
            int head = 0;
            int tail = A[i].length - 1;

            while (head <= tail) {
                int temp = A[i][head];
                A[i][head++] = A[i][tail] ^ 1;
                A[i][tail--] = temp ^ 1;
            }
        }

        return A;
    }
}
