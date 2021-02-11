package com.studio3104.leetcode.explore.challenge.y2021.February.day11;

import java.util.Arrays;

class Solution {
    private int[] countElements(String u) {
        int[] e = new int[26];
        for (char c : u.toCharArray()) {
            ++e[c - 'a'];
        }
        return e;
    }

    public boolean isAnagram(String s, String t) {
        return Arrays.equals(countElements(s), countElements(t));
    }
}
