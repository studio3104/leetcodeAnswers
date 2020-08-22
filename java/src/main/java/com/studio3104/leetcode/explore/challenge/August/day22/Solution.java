package com.studio3104.leetcode.explore.challenge.August.day22;

import java.util.concurrent.ThreadLocalRandom;

public class Solution {
    int[][] rects;

    public Solution(int[][] rects) { this.rects = rects; }

    public int[] pick() {
        int[] r = rects[ThreadLocalRandom.current().nextInt(0, rects.length)];
        int x = ThreadLocalRandom.current().nextInt(r[0], r[2] + 1);
        int y = ThreadLocalRandom.current().nextInt(r[1], r[3] + 1);
        return new int[]{x, y};
    }
}
