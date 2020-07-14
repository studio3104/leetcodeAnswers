package com.studio3104.leetcode.explore.challenge.july.day14;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SolutionTest {
    Solution solution = new Solution();

    @ParameterizedTest
    @CsvSource({
            "12, 30, 165",
            "3, 30, 75",
            "3, 15, 7.5",
            "4, 50, 155",
            "12, 0, 0"
    })
    void angleClock(int hour, int minutes, double expected) {
        double result = solution.angleClock(hour, minutes);
        Assertions.assertEquals(expected, result);
    }
}