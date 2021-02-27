package com.studio3104.leetcode.explore.challenge.y2021.February.day27;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SolutionTest {
    @ParameterizedTest
    @CsvSource({
            "10, 3, 3",
            "7, -3, -2",
            "0, 1, 0",
            "1, 1, 1",
            "-1, 1, -1",
    })
    void divide(int dividend, int divisor, int expected) {
        Solution solution = new Solution();
        int actual = solution.divide(dividend, divisor);
        Assertions.assertEquals(expected, actual);
    }
}
