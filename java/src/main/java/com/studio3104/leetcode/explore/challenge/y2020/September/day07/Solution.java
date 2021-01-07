package com.studio3104.leetcode.explore.challenge.y2020.September.day07;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean wordPattern(String pattern, String str) {
        Map<Character, String> memo1 = new HashMap<>();
        Map<String, Character> memo2 = new HashMap<>();
        String[] strings = str.split(" ");

        if (pattern.length() != strings.length) return false;

        for (int i = 0; i < pattern.length(); ++i) {
            char p = pattern.charAt(i);
            String s = strings[i];

            if (memo1.containsKey(p)) {
                if (!memo1.get(p).equals(s)) return false;
                continue;
            }

            if (memo2.containsKey(s)) return false;

            memo1.put(p, s);
            memo2.put(s, p);
        }

        return true;
    }
}
