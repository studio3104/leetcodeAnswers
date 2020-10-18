package com.studio3104.leetcode.Problems.BestTimeToBuyAndSellStock.p3;

public class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length <= 1) return 0;

        int minSoFar = prices[0];
        int currentBottom = prices[0];

        int singleMaxProfit = 0;
        int maxProfit = 0;

        for (int i = 1; i < prices.length; ++i) {
            int current = prices[i];
            int previous = prices[i - 1];

            if (previous > current) {
                maxProfit = Math.max(maxProfit, singleMaxProfit + previous - currentBottom);
                singleMaxProfit = Math.max(singleMaxProfit, previous - minSoFar);
                currentBottom = current;
            }

            minSoFar = Math.min(minSoFar, current);
        }

        return Math.max(maxProfit, singleMaxProfit + prices[prices.length - 1] - currentBottom);
    }
}
