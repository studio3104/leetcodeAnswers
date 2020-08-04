package com.studio3104.leetcode.explore.challenge.August.day04;

class Solution {
    public boolean isPowerOfFour(int num) {
        return Integer.bitCount(num) == 1 && Integer.numberOfTrailingZeros(num) % 2 == 0;
    }
}
