package com.studio3104.leetcode.explore.challenge.y2021.January.week1;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean canPermutePalindrome(String s) {
        Map<Character, Integer> counter = new HashMap<>();
        for (char c : s.toCharArray()) {
            counter.put(c, counter.getOrDefault(c, 0) + 1);
        }

        int odd = (int) counter.values().stream().filter(n -> n % 2 != 0).count();
        return odd <= 1;
    }
}
