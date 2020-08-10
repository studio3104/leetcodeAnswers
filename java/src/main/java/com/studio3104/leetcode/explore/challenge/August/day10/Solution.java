package com.studio3104.leetcode.explore.challenge.August.day10;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    Map<Character, Integer> map;

    Solution() {
        map = new HashMap<>();
        for (int i = 0; i < 26; ++i) map.put((char) ('A' + i), i + 1);
    }

    public int titleToNumber(String s) {
        int num = 0, k = 0;

        for (int i = s.length() - 1; i >= 0; --i) {
            num += Math.pow(26, k++) * map.get(s.charAt(i));
        }

        return num;
    }
}
