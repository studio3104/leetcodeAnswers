package com.studio3104.leetcode.Problems.p0696CountBinarySubstrings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SolutionTest {
    Solution solution = new Solution();

    @ParameterizedTest
    @CsvSource({
            "00110011, 6",
            "10101, 4",
            "00110, 3",
    })
    void countBinarySubstrings(String s, int expected) {
        int result = solution.countBinarySubstrings(s);
        Assertions.assertEquals(expected, result);
    }
}
