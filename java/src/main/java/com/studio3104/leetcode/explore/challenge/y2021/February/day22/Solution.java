package com.studio3104.leetcode.explore.challenge.y2021.February.day22;

import java.util.List;

class Solution {
    public boolean isSubsequence(String x, String y) {
        int j = 0;
        for (int i = 0; i < y.length() && j < x.length(); ++i) {
            if (x.charAt(j) == y.charAt(i)) {
                ++j;
            }
        }
        return j == x.length();
    }

    public String findLongestWord(String s, List<String> d) {
        d.sort((s1, s2) -> s2.length() != s1.length() ? s2.length() - s1.length() : s1.compareTo(s2));

        for (String str : d) {
            if (isSubsequence(str, s)) {
                return str;
            }
        }

        return "";
    }
}
