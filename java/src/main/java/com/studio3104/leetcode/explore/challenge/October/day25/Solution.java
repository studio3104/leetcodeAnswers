package com.studio3104.leetcode.explore.challenge.October.day25;

import java.util.HashMap;
import java.util.Map;

class Solution {
    private final Map<Integer, Boolean> memo = new HashMap<>() {{
        put(0, false);
        put(1, true);
        put(2, false);
    }};

    public boolean winnerSquareGame(int n) {
        if (memo.containsKey(n)) return memo.get(n);

        boolean result = false;

        for (int i = 1; i <= Math.sqrt(n); ++i) {
            if (!winnerSquareGame(n - (int) Math.pow(i, 2))) {
                result = true;
                break;
            }
        }

        memo.put(n, result);
        return result;
    }
}
