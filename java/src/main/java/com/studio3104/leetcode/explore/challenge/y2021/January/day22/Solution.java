package com.studio3104.leetcode.explore.challenge.y2021.January.day22;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    private int[] countChar(String word) {
        Map<Character, Integer> counter = new HashMap<>();
        for (char c : word.toCharArray()) {
            counter.put(c, counter.getOrDefault(c, 0) + 1);
        }
        return counter.values().stream().mapToInt(n -> n).sorted().toArray();
    }

    public boolean closeStrings(String word1, String word2) {
        return Arrays.equals(countChar(word1), countChar(word2));
    }
}
