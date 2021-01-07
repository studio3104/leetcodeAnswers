package com.studio3104.leetcode.explore.challenge.y2020.December.day08;

class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        int count = 0;
        int[] surpluses = new int[60];

        for (int t : time) {
            int s = t % 60;
            count += s == 0 ? surpluses[s] : surpluses[60 - s];
            ++surpluses[s];
        }

        return count;
    }
}
