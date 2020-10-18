package com.studio3104.leetcode.Problems.BestTimeToBuyAndSellStock.p1;

public class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length < 1) return 0;

        int maxProfitSoFar = 0;
        int minPriceSoFar = prices[0];

        for (int i = 1; i < prices.length; ++i) {
            int price = prices[i];
            maxProfitSoFar = Math.max(maxProfitSoFar, price - minPriceSoFar);
            minPriceSoFar = Math.min(minPriceSoFar, price);
        }

        return maxProfitSoFar;
    }
}
