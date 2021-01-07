package com.studio3104.leetcode.explore.challenge.y2020.September.day23;

public class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int total = 0, current = 0;
        int start = 0;

        for (int i = 0; i < gas.length; ++i) {
            total += gas[i] - cost[i];
            current += gas[i] - cost[i];

            if (current >= 0) continue;

            current = 0;
            start = i + 1;
        }

        return total >= 0 ? start : -1;
    }
}
