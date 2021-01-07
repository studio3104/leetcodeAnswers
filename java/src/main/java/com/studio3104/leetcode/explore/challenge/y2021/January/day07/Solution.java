package com.studio3104.leetcode.explore.challenge.y2021.January.day07;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> lastIndexOf = new HashMap<>();

        int head = 0;
        int longest = 0;

        for (int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);

            int last = lastIndexOf.getOrDefault(c, -1);
            if (last >= head) {
                head = last + 1;
            }

            longest = Math.max(longest, i - head + 1);
            lastIndexOf.put(c, i);
        }

        return longest;
    }
}
