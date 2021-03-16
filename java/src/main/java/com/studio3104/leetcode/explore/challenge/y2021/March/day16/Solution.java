package com.studio3104.leetcode.explore.challenge.y2021.March.day16;

class Solution {
    public int maxProfit(int[] prices, int fee) {
        if (prices.length == 0) {
            return 0;
        }

        int profit = 0;
        int pending = prices[0] * -1;

        for (int price : prices) {
            profit = Math.max(profit, pending + price - fee);
            pending = Math.max(pending, profit - price);
        }

        return profit;
    }
}
