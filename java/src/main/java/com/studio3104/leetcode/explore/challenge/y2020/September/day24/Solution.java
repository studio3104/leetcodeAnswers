package com.studio3104.leetcode.explore.challenge.y2020.September.day24;

public class Solution {
    public char findTheDifference(String s, String t) {
        char diff = 0;

        for (char c: s.toCharArray()) diff ^= c;
        for (char c: t.toCharArray()) diff ^= c;

        return diff;
    }
}
