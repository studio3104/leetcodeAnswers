package com.studio3104.leetcode.explore.challenge.September.day15;

public class Solution {
    public int lengthOfLastWord(String s) {
        int l = 0;
        s = s.strip();

        for (int i = s.length() - 1; i >= 0; --i) {
            if (s.charAt(i) == ' ') break;
            ++l;
        }

        return l;
    }
}
