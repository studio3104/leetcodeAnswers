package com.studio3104.leetcode.explore.challenge.y2020.July.day30;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    String s;
    List<String> wordDict;

    List<String> wordBreak(int current, int wordIndex, Set<Integer> used, List<String> words) {
        String candidate = wordDict.get(wordIndex);
        String target = s.substring(current, candidate.length());
        if (!candidate.equals(target)) return words;

        StringBuilder word = new StringBuilder(candidate);
        word.append(" ");

        used.add(wordIndex);
        current = candidate.length();

        while (wordDict.size() > used.size()) {

        }

        return words;
    }

    public List<String> wordBreak(String s, List<String> wordDict) {
        this.s = s;
        this.wordDict = wordDict;
        List<String> words = new ArrayList<>();

        for (int i = 0; i < wordDict.size(); ++i) {
            words.addAll(wordBreak(0, i, new HashSet<>(), new ArrayList<>()));
        }

        return words;
    }
}
