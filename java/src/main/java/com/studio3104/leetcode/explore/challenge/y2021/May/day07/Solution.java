package com.studio3104.leetcode.explore.challenge.y2021.May.day07;

class Solution {
    private int getLevenshteinDistance(String word1, String word2, int len1, int len2) {
        if (len1 == 0) {
            return len2;
        }
        if (len2 == 0) {
            return len1;
        }

        int distance = word1.charAt(len1 - 1) == word2.charAt(len2 - 1) ? 0 : 1;

        return Math.min(
                getLevenshteinDistance(word1, word2, len1 - 1, len2 - 1) + distance,
                Math.min(
                        getLevenshteinDistance(word1, word2, len1 - 1, len2) + 1,
                        getLevenshteinDistance(word1, word2, len1, len2 - 1) + 1
                )
        );
    }

    public int minDistance(String word1, String word2) {
        return getLevenshteinDistance(word1, word2, word1.length(), word2.length());
    }
}
