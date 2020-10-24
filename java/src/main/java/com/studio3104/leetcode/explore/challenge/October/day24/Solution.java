package com.studio3104.leetcode.explore.challenge.October.day24;

import java.util.Arrays;

public class Solution {
    public int bagOfTokensScore(int[] tokens, int P) {
        Arrays.sort(tokens);

        int currentScore = 0, maxScore = currentScore;
        int head = 0, tail = tokens.length - 1;

        while (head <= tail) {
            if (tokens[head] <= P) {
                ++currentScore;
                P -= tokens[head++];
                maxScore = Math.max(maxScore, currentScore);
                continue;
            }

            if (currentScore <= 0) break;

            --currentScore;
            P += tokens[tail--];
        }

        return maxScore;
    }
}
