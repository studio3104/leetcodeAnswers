package com.studio3104.leetcode.explore.challenge.july.day14;

public class Solution {
    final double HD = 360.0 / 12;
    final double MD = 360.0 / 60;

    public double angleClock(int hour, int minutes) {
        double h = HD * hour + HD * minutes / 60;
        double m = MD * minutes;

        double answer = Math.abs(h - m);
        return Math.min(answer, 360.0 - answer);
    }
}
