package com.studio3104.leetcode.explore.challenge.july.day15;

public class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        String[] str = s.split("\\s+");
        StringBuilder result = new StringBuilder(str[str.length - 1]);
        for (int i = str.length - 2; i >=0; --i) {
            result.append(" ").append(str[i]);
        }
        return result.toString();
    }
}
