package com.studio3104.leetcode.explore.challenge.y2021.May.day10;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SolutionTest {
    @ParameterizedTest
    @CsvSource({
            "10, 4",
            "0, 0",
            "1, 0",
            "2, 0",
            "499979, 41537",
    })
    void countPrimes(int n, int expected) {
        Solution solution = new Solution();
        int actual = solution.countPrimes(n);
        Assertions.assertEquals(expected, actual);
    }
}
