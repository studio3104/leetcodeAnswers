package com.studio3104.leetcode.explore.challenge.October.day25;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SolutionTest {
    Solution solution = new Solution();

    @ParameterizedTest
    @CsvSource({
            "1, true",
            "2, false",
            "4, true",
            "7, false",
            "8, true",
            "12, false",
            "17, false",
            "32, true",
            "99, true",
            "99857, true",
    })
    void winnerSquareGame(int n, boolean expected) {
        boolean result = solution.winnerSquareGame(n);
        Assertions.assertEquals(expected, result);
    }
}
