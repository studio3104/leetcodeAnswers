package com.studio3104.leetcode.explore.challenge.September.day24;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public char findTheDifference(String s, String t) {
        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();

        for (int i = 0; i < s.length(); ++i) {
            char sChar = s.charAt(i), tChar = t.charAt(i);
            sMap.put(sChar, sMap.getOrDefault(sChar, 0) + 1);
            tMap.put(tChar, tMap.getOrDefault(tChar, 0) + 1);
        }
        char tChar = t.charAt(t.length() - 1);
        tMap.put(tChar, tMap.getOrDefault(tChar, 0) + 1);

        char difference = ' ';
        for (char c: tMap.keySet()) {
            if (!sMap.getOrDefault(c, -1).equals(tMap.get(c))) {
                difference = c;
                break;
            }
        }

        return difference;
    }
}
