package com.studio3104.leetcode.explore.collection.easy.string.FirstUniqueCharacterInAString;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> memo = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            memo.put(c, memo.getOrDefault(c, 0) + 1);
        }

        for (int j = 0; j < s.length(); j++) {
            if (memo.get(s.charAt(j)) == 1) return j;
        }

        return -1;
    }
}
