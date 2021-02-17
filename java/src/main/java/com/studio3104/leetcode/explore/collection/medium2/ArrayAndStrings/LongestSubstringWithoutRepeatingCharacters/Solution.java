package com.studio3104.leetcode.explore.collection.medium2.ArrayAndStrings.LongestSubstringWithoutRepeatingCharacters;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        // Store indexes that each element appeared at last into a HashMap
        // During the iteration,
        // - Check the distance from current element to a point that is initially 0
        // - If the current element has already appeared, the point is gonna be the same value as the last index
        // - Update the maximum distance

        int longest = 0;
        int p = 0;
        Map<Character, Integer> lastOf = new HashMap<>();

        for (int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);

            int last = lastOf.getOrDefault(c, -1);
            p = last >= p ? last + 1 : p;
            longest = Math.max(longest, i - p + 1);

            lastOf.put(c, i);
        }

        return longest;
    }
}
