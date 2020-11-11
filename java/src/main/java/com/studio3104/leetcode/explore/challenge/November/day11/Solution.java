package com.studio3104.leetcode.explore.challenge.November.day11;

class Solution {
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        int x = p1[0], y = p1[1];
        x += p2[0]; y += p2[1];
        x += p3[0]; y += p3[1];
        x += p4[0]; y += p4[1];
        return x == y;
    }
}
