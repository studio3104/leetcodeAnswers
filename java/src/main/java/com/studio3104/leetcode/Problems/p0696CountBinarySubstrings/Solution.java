package com.studio3104.leetcode.Problems.p0696CountBinarySubstrings;

public class Solution {
    public int countBinarySubstrings(String s) {
        int count = 0, previous = 0, current = 1;

        for (int i = 1; i < s.length(); ++i) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                ++current;
                continue;
            }
            count += Math.min(previous, current);
            previous = current;
            current = 1;
        }

        return count + Math.min(previous, current);
    }
}
