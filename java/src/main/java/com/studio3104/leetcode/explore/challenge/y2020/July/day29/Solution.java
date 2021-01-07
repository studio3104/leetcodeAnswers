package com.studio3104.leetcode.explore.challenge.y2020.July.day29;

public class Solution {
    public int maxProfit(int[] prices) {
        int sold = Integer.MIN_VALUE;
        int held = Integer.MIN_VALUE;
        int reset = 0;

        for (int price: prices) {
            int previousSold = sold;

            sold = held + price;
            held = Math.max(held, reset - price);
            reset = Math.max(reset, previousSold);
        }

        return Math.max(sold, reset);
    }
}
