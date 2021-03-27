package com.studio3104.leetcode.explore.challenge.y2021.March.day26;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Solution {
    private boolean isSubset(Map<Character, Integer> countOf, List<Map<Character, Integer>> bCounters) {
        for (Map<Character, Integer> counter : bCounters) {
            for (char c : counter.keySet()) {
                if (!countOf.containsKey(c) || countOf.get(c) < counter.get(c)) {
                    return false;
                }
            }
        }
        return true;
    }

    private Map<Character, Integer> countChar(String word) {
        Map<Character, Integer> counter = new HashMap<>();
        for (char c : word.toCharArray()) {
            counter.put(c, counter.getOrDefault(c, 0) + 1);
        }
        return counter;
    }

    public List<String> wordSubsets(String[] A, String[] B) {
        List<Map<Character, Integer>> bCounters = Arrays.stream(B)
                .map(this::countChar)
                .collect(Collectors.toList());

        return Arrays.stream(A)
                .filter(s -> isSubset(countChar(s), bCounters))
                .collect(Collectors.toList());
    }
}
