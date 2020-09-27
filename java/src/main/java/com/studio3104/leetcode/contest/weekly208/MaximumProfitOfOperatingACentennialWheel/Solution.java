package com.studio3104.leetcode.contest.weekly208.MaximumProfitOfOperatingACentennialWheel;

public class Solution {
    final int LIMIT = 4;

    public int minOperationsMaxProfit(int[] customers, int boardingCost, int runningCost) {
        int waiting = 0;
        int boarded = 0;
        int rotated = 0;

        int profit;
        int highestProfit = -1;
        int highestProfitRotateCount = 0;

        for (int c: customers) {
            ++rotated;

            waiting += c;
            int board;
            if (waiting > LIMIT) {
                board = LIMIT;
                waiting -= board;
            } else {
                board = waiting;
                waiting = 0;
            }

            boarded += board;

            profit = boarded * boardingCost - rotated * runningCost;
            if (profit > highestProfit) {
                highestProfit = profit;
                highestProfitRotateCount = rotated;
            }
        }

        while (waiting > 0) {
            ++rotated;

            int board;
            if (waiting > LIMIT) {
                board = LIMIT;
                waiting -= board;
            } else {
                board = waiting;
                waiting = 0;
            }

            boarded += board;

            profit = boarded * boardingCost - rotated * runningCost;
            if (profit > highestProfit) {
                highestProfit = profit;
                highestProfitRotateCount = rotated;
            }
        }

        return highestProfit == -1 ? -1 : highestProfitRotateCount;
    }
}
