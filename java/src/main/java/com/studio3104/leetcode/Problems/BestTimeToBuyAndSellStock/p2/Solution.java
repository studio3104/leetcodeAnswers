package com.studio3104.leetcode.Problems.BestTimeToBuyAndSellStock.p2;

public class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;

        for (int i = 1; i < prices.length; ++i) {
            int current = prices[i];
            int previous = prices[i - 1];

            if (previous < current) profit += current - previous;
        }

        return profit;
    }
}
