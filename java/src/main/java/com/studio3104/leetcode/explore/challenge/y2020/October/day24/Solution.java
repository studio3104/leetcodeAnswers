package com.studio3104.leetcode.explore.challenge.y2020.October.day24;

import java.util.Arrays;

public class Solution {
    public int bagOfTokensScore(int[] tokens, int P) {
        Arrays.sort(tokens);

        int score = 0;
        int head = 0, tail = tokens.length - 1;

        while (head <= tail) {
            if (tokens[head] <= P) {
                ++score;
                P -= tokens[head++];
                continue;
            }

            if (score == 0 || head == tail) break;

            --score;
            P += tokens[tail--];
        }

        return score;
    }
}
