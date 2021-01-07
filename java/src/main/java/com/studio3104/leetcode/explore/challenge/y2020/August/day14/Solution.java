package com.studio3104.leetcode.explore.challenge.y2020.August.day14;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int longestPalindrome(String s) {
        Map<Character, Integer> counter = new HashMap<>();
        for (char c: s.toCharArray()) {
            counter.put(c, counter.getOrDefault(c, 0) + 1);
        }

        int answer = 0;
        boolean containsOdd = false;

        for (int count: counter.values()) {
            answer += count;
            if (count % 2 != 0) {
                containsOdd = true;
                answer -= 1;
            }
        }

        return answer + (containsOdd ? 1 : 0);
    }
}
