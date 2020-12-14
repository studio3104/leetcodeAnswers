package com.studio3104.leetcode.explore.challenge.December.day14;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

class Solution {
    private boolean isPalindrome(int head, int tail, String s) {
        while (head <= tail) {
            if (s.charAt(head++) != s.charAt(tail--)) {
                return false;
            }
        }
        return true;
    }

    private void backtrack(int head, String s, Deque<String> current, List<List<String>> result) {
        if (head >= s.length()) {
            result.add(new ArrayList<>(current));
        }

        for (int tail = head; tail < s.length(); ++tail) {
            if (!isPalindrome(head, tail, s)) {
                continue;
            }

            current.add(s.substring(head, tail + 1));
            backtrack(tail + 1, s, current, result);
            current.pollLast();
        }
    }

    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        backtrack(0, s, new ArrayDeque<>(), result);
        return result;
    }
}
