package com.studio3104.leetcode.explore.challenge.November.day25;

class Solution {
    public int smallestRepunitDivByK(int K) {
        int N = 1;

        for (int i = 1; i <= K; ++i) {
            N %= K;
            if (N == 0) return i;
            N = N * 10 + 1;
        }

        return -1;
    }
}
