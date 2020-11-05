package com.studio3104.leetcode.explore.Learn.Recursion.I.PrincipleOfRecursion.ReverseString;

class Solution {
    private void reverseString(char[] s, int head, int tail) {
        if (head >= tail) return;

        char temporary = s[head];
        s[head] = s[tail];
        s[tail] = temporary;

        reverseString(s, head + 1, tail - 1);
    }

    public void reverseString(char[] s) {
        reverseString(s, 0, s.length - 1);
    }
}
