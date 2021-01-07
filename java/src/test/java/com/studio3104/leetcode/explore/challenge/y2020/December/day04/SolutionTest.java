package com.studio3104.leetcode.explore.challenge.y2020.December.day04;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SolutionTest {
    Solution solution = new Solution();

    @ParameterizedTest
    @CsvSource({
            "12, 3, 3",
            "7, 2, 7",
            "4, 4, -1",
            "1, 1, 1",
            "1000, 3, 4",
    })
    void kthFactor(int n, int k, int expected) {
        int actual = solution.kthFactor(n, k);
        Assertions.assertEquals(expected, actual);
    }
}
