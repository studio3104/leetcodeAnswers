package com.studio3104.leetcode.explore.challenge.y2021.February.day18;

class Solution {
    public int numberOfArithmeticSlices(int[] A) {
        int[] m = new int[A.length];
        int num = 0;

        for (int i = 2; i < A.length; ++i) {
            if (A[i - 1] - A[i - 2] == A[i] - A[i - 1]) {
                m[i] = m[i - 1] + 1;
                num += m[i];
            }
        }

        return num;
    }
}
