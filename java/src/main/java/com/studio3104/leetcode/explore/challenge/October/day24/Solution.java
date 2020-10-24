package com.studio3104.leetcode.explore.challenge.October.day24;

import java.util.Arrays;

public class Solution {
    public int bagOfTokensScore(int[] tokens, int P) {
        if (tokens.length == 1) {
            return tokens[0] <= P ? 1 : 0;
        }

        Arrays.sort(tokens);

        int score = 0, maxScore = score;
        int head = 0, tail = tokens.length - 1;

        while (head <= tail) {
            if (tokens[head] > P) {
                if (score > 0) {
                    --score;
                    P += tokens[tail--];
                } else {
                    break;
                }
            } else {
                ++score;
                P -= tokens[head++];
            }

            maxScore = Math.max(maxScore, score);
        }

        return maxScore;
    }
}
