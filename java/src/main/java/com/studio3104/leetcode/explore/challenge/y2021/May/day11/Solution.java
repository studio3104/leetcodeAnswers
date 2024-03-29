package com.studio3104.leetcode.explore.challenge.y2021.May.day11;

import java.util.Arrays;

class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int total = Arrays.stream(cardPoints).sum();
        if (cardPoints.length == k) {
            return total;
        }

        int exclusion = 0;
        for (int i = 0; i < cardPoints.length - k; ++i) {
            exclusion += cardPoints[i];
        }

        int score = total - exclusion;
        for (int i = 0; i < k; ++i) {
            exclusion = exclusion - cardPoints[i] + cardPoints[i + cardPoints.length - k];
            score = Math.max(score, total - exclusion);
        }

        return score;
    }
}
