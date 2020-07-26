package com.studio3104.leetcode.contest.weekly199.BulbSwitcherIV;

public class Solution {
    public int minFlips(String target) {
        int c = 0;
        for (int p = target.length() - 1; p > 0; --p) {
            if (target.charAt(p) != target.charAt(p - 1)) ++c;
        }
        return target.charAt(0) == '0' ? c : c + 1;
    }
}
