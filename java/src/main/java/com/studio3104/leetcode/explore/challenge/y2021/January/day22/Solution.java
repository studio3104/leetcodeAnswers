package com.studio3104.leetcode.explore.challenge.y2021.January.day22;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

class Solution {
    private Map<Set<Character>, List<Integer>> analyzeIngredients(String word) {
        Map<Character, Integer> counter = new HashMap<>();
        for (char c : word.toCharArray()) {
            counter.put(c, counter.getOrDefault(c, 0) + 1);
        }

        return new HashMap<>() {{
            put(
                    counter.keySet(),
                    counter.values().stream().sorted().mapToInt(n -> n).boxed().collect(Collectors.toList())
            );
        }};
    }

    public boolean closeStrings(String word1, String word2) {
        return analyzeIngredients(word1).equals(analyzeIngredients(word2));
    }
}
