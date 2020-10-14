package com.studio3104.leetcode.Problems.p1249MinimumRemoveToMakeValidParentheses;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public String minRemoveToMakeValid(String s) {
        Deque<Integer> open = new ArrayDeque<>();
        Deque<Integer> close = new ArrayDeque<>();

        for (int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);
            if (c == '(') open.add(i);
            else if (c == ')' && open.pollLast() == null) close.add(i);
        }

        Set<Integer> toRemove = new HashSet<>(open);
        toRemove.addAll(close);

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); ++i) {
            if (toRemove.contains(i)) continue;
            sb.append(s.charAt(i));
        }

        return sb.toString();
    }
}
