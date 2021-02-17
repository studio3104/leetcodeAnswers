package com.studio3104.leetcode.explore.collection.medium2.ArrayAndStrings.GroupAnagrams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    private Map<Character, Integer> countChars(String str) {
        Map<Character, Integer> counter = new HashMap<>();
        for (char c : str.toCharArray()) {
            counter.put(c, counter.getOrDefault(c, 0) + 1);
        }
        return counter;
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        // Count characters per a string using HashMap
        // Store original string into a list as the value of the HashMap

        Map<Map<Character, Integer>, List<String>> r = new HashMap<>();
        for (String str : strs) {
            Map<Character, Integer> c = countChars(str);
            r.putIfAbsent(c, new ArrayList<>());
            r.get(c).add(str);
        }

        return new ArrayList<>(r.values());
    }
}
