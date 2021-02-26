package com.studio3104.leetcode.explore.challenge.y2021.February.day26;

import java.util.Stack;

class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int i = 0;

        for (int n : pushed) {
            stack.push(n);
            while (!stack.isEmpty() && i < pushed.length && stack.peek() == popped[i]) {
                stack.pop();
                ++i;
            }
        }

        return i == pushed.length;
    }
}
