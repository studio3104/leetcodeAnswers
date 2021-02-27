package com.studio3104.leetcode.Problems.CuratedAlgo170.p1197MinimumKnightMoves;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SolutionTest {
    @ParameterizedTest
    @CsvSource({
            "2, 1, 1",
            "6, 6, 4",
            "5, 5, 4",
            "270, -21, 135",
    })
    void minKnightMoves(int x, int y, int expected) {
        Solution solution = new Solution();
        int actual = solution.minKnightMoves(x, y);
        Assertions.assertEquals(expected, actual);
    }
}
