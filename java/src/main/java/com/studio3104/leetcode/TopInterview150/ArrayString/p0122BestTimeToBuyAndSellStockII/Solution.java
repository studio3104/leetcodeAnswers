package com.studio3104.leetcode.TopInterview150.ArrayString.p0122BestTimeToBuyAndSellStockII;

class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;

        for (int i = 0; i < prices.length - 1; ++i) {
            if (prices[i] < prices[i + 1]) {
                profit += prices[i + 1] - prices[i];
            }
        }

        return profit;
    }
}
