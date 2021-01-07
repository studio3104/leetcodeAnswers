package com.studio3104.leetcode.explore.challenge.y2020.November.day05;

import java.util.Arrays;

class Solution {
    public int minCostToMoveChips(int[] position) {
        int even = (int) Arrays.stream(position).filter(p -> p % 2 == 0).count();
        return Math.min(even, position.length - even);
    }
}
