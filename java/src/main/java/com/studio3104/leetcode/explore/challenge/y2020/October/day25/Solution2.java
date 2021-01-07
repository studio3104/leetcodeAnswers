package com.studio3104.leetcode.explore.challenge.y2020.October.day25;

import java.util.HashMap;
import java.util.Map;

class Solution2 {
    private final Map<Integer, Boolean> memo = new HashMap<>() {{
        put(0, false);
        put(1, true);
        put(2, false);
    }};

    public boolean winnerSquareGame(int n) {
        if (memo.containsKey(n)) {
            return memo.get(n);
        }

        boolean result = false;

        for (int i = 1; i <= Math.sqrt(n); ++i) {
            if (!winnerSquareGame(n - i * i)) {
                result = true;
                break;
            }
        }

        memo.put(n, result);
        return result;
    }
}
