package com.studio3104.leetcode.explore.challenge.july.day14;

public class Solution {
    final double HD = 360.0 / 12;
    final double MD = 360.0 / 60;

    public double angleClock(int hour, int minutes) {
        hour = hour == 12 ? 0 : hour;
        double h = HD * hour + HD * minutes / 60;
        double m = MD * minutes;

        double answer = Math.max(h, m) - Math.min(h, m);
        return answer <= 180 ? answer : 360.0 - answer;
    }
}
