package com.studio3104.leetcode.explore.interview.amazon.Others.ReverseInteger;

public class Solution {
    public int reverse(int x) {
        int a = 0;
        int maxDiv10 = Integer.MAX_VALUE / 10;
        int minDiv10 = Integer.MIN_VALUE / 10;

        for (int i = x; i != 0; i /= 10) {
            int s = i % 10;
            if (a > maxDiv10 || (a == maxDiv10 && s > 7)) return 0;
            if (a < minDiv10 || (a == minDiv10 && s < -8)) return 0;
            a = a * 10 + s;
        }

        return a;
    }
}
