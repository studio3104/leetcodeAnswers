package com.studio3104.leetcode.explore.challenge.y2020.December.day04;

class Solution {
    public int kthFactor(int n, int k) {
        int count = 0;

        for (int i = 1; i <= n; ++i) {
            if (n % i == 0) {
                ++count;
            }
            if (count == k) {
                return i;
            }
        }

        return -1;
    }
}
