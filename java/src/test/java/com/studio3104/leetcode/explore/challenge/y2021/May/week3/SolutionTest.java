package com.studio3104.leetcode.explore.challenge.y2021.May.week3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SolutionTest {
    @ParameterizedTest
    @CsvSource({
            "2, 1, 1",
            "5, 5, 4",
            "217, 47, 110",
    })
    void minKnightMoves(int x, int y, int expected) {
        Solution solution = new Solution();
        int actual = solution.minKnightMoves(x, y);
        Assertions.assertEquals(expected, actual);
    }
}
