package com.studio3104.leetcode.explore.challenge.y2020.September.day18;

public class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length == 0) return 0;
        int lowestSoFar = prices[0];
        int maxProfitSoFar = 0;

        for (int i = 1; i < prices.length; ++i) {
            int price = prices[i];
            maxProfitSoFar = Math.max(maxProfitSoFar, price - lowestSoFar);
            lowestSoFar = Math.min(lowestSoFar, price);
        }

        return maxProfitSoFar;
    }
}
