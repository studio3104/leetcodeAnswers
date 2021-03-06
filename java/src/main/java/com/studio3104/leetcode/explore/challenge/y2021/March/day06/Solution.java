package com.studio3104.leetcode.explore.challenge.y2021.March.day06;

class Solution {
    public int minimumLengthEncoding(String[] words) {
        if (words.length == 1) {
            return words[0].length() + 1;
        }

        StringBuilder sb = new StringBuilder(words[0]);

        for (int i = 1; i < words.length; ++i) {
            if (sb.charAt(sb.length() - 1) != '#') {
                sb.append('#');
            }
            String word = words[i];
            if (sb.lastIndexOf(word) != sb.length() - word.length() - 1) {
                sb.append(word);
            }
        }

        if (sb.charAt(sb.length() - 1) != '#') {
            sb.append('#');
        }
        return sb.length();
    }
}
