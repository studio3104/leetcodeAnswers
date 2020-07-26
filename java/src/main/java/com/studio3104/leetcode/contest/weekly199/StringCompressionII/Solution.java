package com.studio3104.leetcode.contest.weekly199.StringCompressionII;

import java.util.LinkedList;

public class Solution {
    public int getLengthOfOptimalCompression(String s, int k) {
        LinkedList<Character> stack = new LinkedList<>();
        for (char c: s.toCharArray()) {
            if (c == stack.peek()) {
                stack.add(c);
                continue;
            }


        }

        return k;
    }
}
