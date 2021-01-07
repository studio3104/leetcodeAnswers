package com.studio3104.leetcode.explore.challenge.y2020.November.day03;

class Solution {
    public int maxPower(String s) {
        char currentChar = s.charAt(0);
        int currentPow = 0;
        int max = 1;

        for (char c : s.toCharArray()) {
            if (c == currentChar) {
                ++currentPow;
            } else {
                currentChar = c;
                currentPow = 1;
            }
            max = Math.max(max, currentPow);
        }
        return max;
    }
}
