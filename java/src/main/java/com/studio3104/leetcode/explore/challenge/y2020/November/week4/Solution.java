package com.studio3104.leetcode.explore.challenge.y2020.November.week4;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int lengthOfLongestSubstringTwoDistinct(String s) {
        Map<Character, Integer> lastIndexOf = new HashMap<>();

        int head = 0;
        int longest = 0;

        for (int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);
            lastIndexOf.put(c, i);

            if (lastIndexOf.size() <= 2) {
                longest = Math.max(longest, i - head + 1);
                continue;
            }

            int indexToRemove = Collections.min(lastIndexOf.values());
            lastIndexOf.remove(s.charAt(indexToRemove));
            head = indexToRemove + 1;
        }

        return longest;
    }
}
