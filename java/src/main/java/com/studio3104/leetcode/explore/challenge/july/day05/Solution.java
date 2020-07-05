package com.studio3104.leetcode.explore.challenge.july.day05;

class Solution {
    public int hammingDistance(int x, int y) {
        return Integer.bitCount(x ^ y);
    }
}
