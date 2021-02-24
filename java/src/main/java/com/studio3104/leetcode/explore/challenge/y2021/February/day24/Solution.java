package com.studio3104.leetcode.explore.challenge.y2021.February.day24;

import java.util.Stack;

class Solution {
    public int scoreOfParentheses(String S) {
        Stack<Integer> stack = new Stack<>();
        stack.push(0);

        for (char c : S.toCharArray()) {
            if (c == '(') {
                stack.push(0);
                continue;
            }

            int a = stack.pop();
            int b = stack.pop();
            stack.push(b + Math.max(1, 2 * a));
        }

        return stack.pop();
    }
}
