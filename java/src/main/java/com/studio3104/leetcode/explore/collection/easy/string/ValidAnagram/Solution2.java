package com.studio3104.leetcode.explore.collection.easy.string.ValidAnagram;

public class Solution2 {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] memo = new int[26];

        for (int i = 0; i < s.length(); i++) {
            memo[s.charAt(i) - 'a']++;
        }
        for (int j = 0; j < t.length(); j++) {
            char c = t.charAt(j);
            memo[c - 'a']--;
            if (memo[c - 'a'] < 0) return false;
        }

        return true;
    }
}
