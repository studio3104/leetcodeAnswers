package com.studio3104.leetcode.contest.weekly199.ShuffleString;

public class Solution {
    public String restoreString(String s, int[] indices) {
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < s.length(); ++i) {
            int p = indices[i];
            sb.replace(p, p + 1, Character.toString(s.charAt(i)));
        }
        return sb.toString();
    }
}
