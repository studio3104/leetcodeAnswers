package com.studio3104.leetcode.explore.challenge.y2020.August.day04;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SolutionTest {
    Solution solution = new Solution();

    @ParameterizedTest
    @CsvSource({
            "16, true",
            "5, false",
            "1, true",
            "-2147483648, false",
            "32, false",
    })
    void isPowerOfFour(int num, boolean expected) {
        boolean result = solution.isPowerOfFour(num);
        Assertions.assertEquals(expected, result);
    }
}
