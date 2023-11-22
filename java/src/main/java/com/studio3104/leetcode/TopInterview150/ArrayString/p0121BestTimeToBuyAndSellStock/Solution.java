package com.studio3104.leetcode.TopInterview150.ArrayString.p0121BestTimeToBuyAndSellStock;

class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int minSoFar = Integer.MAX_VALUE;

        for (int price : prices) {
            minSoFar = Integer.min(minSoFar, price);
            profit = Integer.max(profit, price - minSoFar);
        }

        return profit;
    }
}
