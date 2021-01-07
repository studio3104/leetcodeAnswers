package com.studio3104.leetcode.explore.challenge.y2020.July.day26;

class Solution {
    public int addDigits(int num) {
        if (num == 0) return 0;
        int d = num % 9;
        return d == 0 ? 9 : d;
    }
}
