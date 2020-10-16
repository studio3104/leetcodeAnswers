package com.studio3104.leetcode.Problems.p0003LongestSubstringWithoutRepeatingCharacters;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> lastAppearedOf = new HashMap<>();

        int currentStartPoint = 0;
        int currentSize;
        int longestSoFar = 0;

        for (int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);

            int lastAppeared = lastAppearedOf.getOrDefault(c, -1);
            if (lastAppeared >= currentStartPoint) currentStartPoint = lastAppeared + 1;

            currentSize = i - currentStartPoint + 1;
            longestSoFar = Math.max(longestSoFar, currentSize);
            lastAppearedOf.put(c, i);
        }

        return longestSoFar;
    }
}
