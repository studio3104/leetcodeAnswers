package com.studio3104.leetcode.explore.challenge.October.day05;

public class Solution {
    public int bitwiseComplement(int N) {
        if (N == 0) return 1;
        int bitmask = 1;
        while (N >= bitmask) bitmask <<= 1;
        return N ^ bitmask - 1;
    }
}
