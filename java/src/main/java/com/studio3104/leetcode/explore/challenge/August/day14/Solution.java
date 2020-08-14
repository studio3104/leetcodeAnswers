package com.studio3104.leetcode.explore.challenge.August.day14;

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
            if (count % 2 == 0) answer += count;
            else {
                containsOdd = true;
                answer += count - 1;
            }
        }

        return answer + (containsOdd ? 1 : 0);
    }
}
