package com.studio3104.leetcode.explore.challenge.y2020.October.day19;

public class Solution {
    public int minDominoRotations(int[] A, int[] B) {
        int a = A[0], b = B[0];
        int countA = 1, countB = 1, countSame = 0;

        for (int i = 1; i < A.length; ++i) {
            int aN = A[i], bN = B[i];

            if (aN != a && bN != a) countA = -1;
            if (aN != b && bN != b) countB = -1;
            if (countA < 0 && countB < 0) return -1;

            if (aN == bN) ++countSame;
            if (countA > 0 && aN == a) ++countA;
            if (countB > 0 && bN == b) ++countB;
        }

        int minA = Math.min(countA - countSame, A.length - countA);
        int minB = Math.min(countB - countSame, A.length - countB);
        if (countA < 0) return minB;
        if (countB < 0) return minA;
        return Math.min(minA, minB);
    }
}
