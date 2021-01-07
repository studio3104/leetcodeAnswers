package com.studio3104.leetcode.explore.challenge.y2020.September.day06;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    public int largestOverlap(int[][] A, int[][] B) {
        Set<List<Integer>> bitsOfA = new HashSet<>();
        Set<List<Integer>> bitsOfB = new HashSet<>();

        for (int i = 0; i < A.length; ++i) {
            for (int j = 0; j < A[0].length; ++j) {
                if (A[i][j] == 1) bitsOfA.add(List.of(i, j));
                if (B[i][j] == 1) bitsOfB.add(List.of(i, j));
            }
        }

        int maxOverlap = 0;

        for (int i = 0; i < A.length; ++i) {
            for (int j = 0; j < A[0].length; ++j) {
                int currentOverlap = 0;
                for (List<Integer> bA: bitsOfA) {
                    int y = bA.get(0) + i, x = bA.get(1) + j;
                    if (y >= A.length) y -= A.length;
                    if (x >= A[0].length) x -= A[0].length;
                    if (bitsOfB.contains(List.of(y, x))) ++currentOverlap;
                }
                if (currentOverlap == Math.min(bitsOfA.size(), bitsOfB.size())) return currentOverlap;
                maxOverlap = Math.max(maxOverlap, currentOverlap);
            }
        }

        return maxOverlap;
    }
}
