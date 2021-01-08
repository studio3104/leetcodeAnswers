package com.studio3104.leetcode.explore.challenge.y2021.January.day08;

class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        int w1i = 0, w1j = 0;
        int w2i = 0, w2j = 0;

        while (true) {
            if (word1[w1i].length() <= w1j) {
                ++w1i;
                w1j = 0;
            }
            if (word2[w2i].length() <= w2j) {
                ++w2i;
                w2j = 0;
            }

            if (w1i >= word1.length || w2i >= word2.length) {
                break;
            }

            char c1 = word1[w1i].charAt(w1j++);
            char c2 = word2[w2i].charAt(w2j++);

            if (c1 != c2) {
                return false;
            }
        }

        return w1i == word1.length && w2i == word2.length;
    }
}
