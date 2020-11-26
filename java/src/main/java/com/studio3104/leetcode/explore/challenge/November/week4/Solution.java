package com.studio3104.leetcode.explore.challenge.November.week4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution {
    public int lengthOfLongestSubstringTwoDistinct(String s) {
        Map<Character, Integer> lastIndexOf = new HashMap<>();
        Set<Character> elements = new HashSet<>();

        int head = 0;
        int longest = 0;

        for (int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);
            lastIndexOf.put(c, i);
            elements.add(c);

            if (elements.size() <= 2) {
                longest = Math.max(longest, i - head + 1);
                continue;
            }

            head = Integer.MAX_VALUE;
            char toRemove = c;
            for (char e : elements) {
                if (head > lastIndexOf.get(e)) {
                    head = lastIndexOf.get(e);
                    toRemove = e;
                }
            }
            ++head;
            elements.remove(toRemove);
        }

        return longest;
    }
}
