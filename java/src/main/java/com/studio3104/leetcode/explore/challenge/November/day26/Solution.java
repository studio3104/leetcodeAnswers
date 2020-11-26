package com.studio3104.leetcode.explore.challenge.November.day26;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    private int longestSubstring(String s, int k, int head, int tail, int longest) {
        int width = tail - head + 1;

        if (width <= 0 ||  width < k || width < longest) {
            return longest;
        }

        Map<Character, List<Integer>> indexesOf = new HashMap<>();
        for (int i = head; i <= tail; ++i) {
            char c = s.charAt(i);
            List<Integer> indexes = indexesOf.getOrDefault(c, new ArrayList<>());
            indexes.add(i);
            indexesOf.put(c, indexes);
        }

        List<Integer> indexesLessThanK = new ArrayList<>();
        for (char c : indexesOf.keySet()) {
            if (indexesOf.get(c).size() < k) {
                indexesLessThanK.addAll(indexesOf.get(c));
            }
        }

        if (indexesLessThanK.size() == 0) {
            return width;
        }

        Collections.sort(indexesLessThanK);
        for (int index : indexesLessThanK) {
            longest = longestSubstring(s, k, head, index - 1, longest);
            head = index + 1;
        }

        return longest;
    }

    public int longestSubstring(String s, int k) {
        return longestSubstring(s, k, 0, s.length() - 1, 0);
    }
}
