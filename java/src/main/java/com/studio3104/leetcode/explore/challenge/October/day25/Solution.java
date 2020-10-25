package com.studio3104.leetcode.explore.challenge.October.day25;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Solution {
    private final List<Integer> SQUARES = IntStream
            .range(1, (int) Math.sqrt(Math.pow(10, 5)))
            .map(n -> (int) Math.pow(n, 2))
            .boxed()
            .collect(Collectors.toList());

    private final Map<Integer, Boolean> memo = new HashMap<>() {{
        put(0, false);
        put(1, true);
        put(2, false);
    }};

    public boolean winnerSquareGame(int n) {
        if (memo.containsKey(n)) memo.get(n);

        boolean result = false;

        for (int square : SQUARES) {
            if (n < square) break;

            if (!winnerSquareGame(n - square)) {
                result = true;
                break;
            }
        }

        memo.put(n, result);
        return result;
    }
}
