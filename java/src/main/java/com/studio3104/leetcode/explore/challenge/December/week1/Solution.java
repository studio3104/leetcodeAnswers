package com.studio3104.leetcode.explore.challenge.December.week1;

class Solution {
    public int shortestDistance(String[] words, String word1, String word2) {
        int shortest = words.length;
        int word1Index = -1;
        int word2Index = -1;

        for (int i = 0; i < words.length; ++i) {
            String s = words[i];

            if (s.equals(word1)) word1Index = i;
            if (s.equals(word2)) word2Index = i;

            if (word1Index == -1 || word2Index == -1) continue;

            shortest = Math.min(shortest, Math.abs(word1Index - word2Index));
        }

        return shortest;
    }
}
