package com.studio3104.leetcode.explore.challenge.y2020.July.day04;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    Solution solution = new Solution();

    @ParameterizedTest
    @CsvSource({
            "10, 12", "12, 16"
    })
    void nthUglyNumber(int n, int expected) {
        int result = solution.nthUglyNumber(n);
        assertEquals(expected, result);
    }
}