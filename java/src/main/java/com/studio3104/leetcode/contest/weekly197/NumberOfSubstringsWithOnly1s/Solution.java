package com.studio3104.leetcode.contest.weekly197.NumberOfSubstringsWithOnly1s;

public class Solution {
    public int numSub(String s) {
        final int MOD = (int) Math.pow(10, 9) + 7;
        int ones = 0;
        int answer = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                answer = (answer + ++ones) % MOD;
            } else {
                ones = 0;
            }
        }

        return answer;
    }
}
