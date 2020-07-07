package com.studio3104.leetcode.explore.collection.easy.string.ValidAnagram;

import java.util.*;

public class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        Map<Character, Integer> sMemo = new HashMap<>();
        Map<Character, Integer> tMemo = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char sc = s.charAt(i);
            sMemo.put(sc, sMemo.getOrDefault(sc, 0) + 1);

            char tc = t.charAt(i);
            tMemo.put(tc, tMemo.getOrDefault(tc, 0) + 1);
        }

         return sMemo.equals(tMemo);
    }
}
