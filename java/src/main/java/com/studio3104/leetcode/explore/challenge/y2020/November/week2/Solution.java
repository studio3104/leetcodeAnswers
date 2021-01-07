package com.studio3104.leetcode.explore.challenge.y2020.November.week2;

import java.util.Arrays;

class Solution {
    public int twoSumLessThanK(int[] A, int K) {
        Arrays.sort(A);

        int result = -1;
        int head = 0, tail = A.length - 1;

        while (head < tail) {
            int sum = A[head] + A[tail];

            if (sum >= K) {
                --tail;
                continue;
            }

            ++head;
            result = Math.max(result, sum);
        }

        return result;
    }
}
