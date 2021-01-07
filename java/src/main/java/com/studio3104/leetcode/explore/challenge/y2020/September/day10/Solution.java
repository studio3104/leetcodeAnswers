package com.studio3104.leetcode.explore.challenge.y2020.September.day10;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {
    public String getHint(String secret, String guess) {
        Map<Character, Set<Integer>> indexesOfSecret = new HashMap<>();
        Map<Character, Integer> counter = new HashMap<>();

        for (int i = 0; i < secret.length(); ++i) {
            char d = secret.charAt(i);
            counter.put(d, counter.getOrDefault(d, 0) + 1);
            indexesOfSecret.putIfAbsent(d, new HashSet<>());
            indexesOfSecret.get(d).add(i);
        }

        int bulls = 0;
        Set<Integer> indexesForCows = new HashSet<>();
        for (int i = 0; i < guess.length(); ++i) {
            char d = guess.charAt(i);
            if (!indexesOfSecret.containsKey(d)) continue;

            if (indexesOfSecret.get(d).contains(i)) {
                ++bulls;
                counter.put(d, counter.get(d) - 1);
            } else {
                indexesForCows.add(i);
            }
        }

        int cows = 0;
        for (int i: indexesForCows) {
            char d = guess.charAt(i);
            int c = counter.get(d);
            if (c == 0) continue;
            counter.put(d, c - 1);
            ++cows;
        }

        return bulls + "A" + cows + "B";
    }
}
