package com.studio3104.leetcode.explore.collection.easy.array.BestTimeToBuyAndSellStockII;

class Solution2 {
    public int maxProfit(int[] prices) {
        int profit  = 0;
        int position = Integer.MAX_VALUE;

        for (int i = 0; i < prices.length - 1; ++i) {
            int current = prices[i];
            if (position < current) {
                profit += current - position;
                position = Integer.MAX_VALUE;
            }
            if (current < prices[i + 1]) {
                position = current;
            }
        }

        int last = prices[prices.length - 1];
        if (position < last) {
            profit += last - position;
        }

        return profit;
    }
}
