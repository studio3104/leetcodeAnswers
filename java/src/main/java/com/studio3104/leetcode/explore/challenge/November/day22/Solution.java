package com.studio3104.leetcode.explore.challenge.November.day22;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution {
    private final Map<Character, String> MORSE = new HashMap<>();

    public Solution() {
        String[] morse = new String[]{".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        for (char c = 'a'; c <= 'z'; ++c) {
            MORSE.put(c, morse[c - 'a']);
        }
    }

    public int uniqueMorseRepresentations(String[] words) {
        Set<String> counter = new HashSet<>();
        for (String word : words) {
            StringBuilder morse = new StringBuilder();
            for (char c : word.toCharArray()) {
                morse.append(MORSE.get(c));
            }
            counter.add(morse.toString());
        }
        return counter.size();
    }
}
