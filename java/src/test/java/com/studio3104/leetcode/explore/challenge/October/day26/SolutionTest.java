package com.studio3104.leetcode.explore.challenge.October.day26;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SolutionTest {
    Solution solution = new Solution();

    @ParameterizedTest
    @CsvSource({
            "1, 1, 1, 0.0",
            "2, 1, 1, 0.5",
            "100000009, 33, 17, 1.0",
    })
    void champagneTower(int poured, int query_row, int query_glass, double expected) {
        double result = solution.champagneTower(poured, query_row, query_glass);
        Assertions.assertEquals(expected, result);
    }
}
