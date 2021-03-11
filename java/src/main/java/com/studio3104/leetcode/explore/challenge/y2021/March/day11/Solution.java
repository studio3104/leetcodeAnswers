package com.studio3104.leetcode.explore.challenge.y2021.March.day11;

import java.util.HashMap;
import java.util.Map;

class Solution {
    private void check(int[] coins, int remain, int currentNumCoins, Map<Integer, Integer> minimums) {
        if (remain <= 0) {
            return;
        }

        for (int c : coins) {
            int nextRemain = remain - c;
            if (minimums.containsKey(nextRemain) && minimums.get(nextRemain) <= currentNumCoins) {
                continue;
            }
            minimums.put(nextRemain, currentNumCoins);
            check(coins, nextRemain, currentNumCoins + 1, minimums);
        }
    }

    public int coinChange(int[] coins, int amount) {
        if (amount == 0) {
            return 0;
        }

        Map<Integer, Integer> minimums = new HashMap<>();
        check(coins, amount, 1, minimums);
        return minimums.getOrDefault(0, -1);
    }
}
