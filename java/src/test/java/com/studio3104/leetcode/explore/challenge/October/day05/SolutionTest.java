package com.studio3104.leetcode.explore.challenge.October.day05;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SolutionTest {
    Solution solution = new Solution();

    @ParameterizedTest
    @CsvSource({
            "5, 2",
            "7, 0",
            "10, 5",
            "2, 1",
            "1, 0",
            "0, 1",
    })
    void bitwiseComplement(int N, int expected) {
        int result = solution.bitwiseComplement(N);
        Assertions.assertEquals(expected, result);
    }
}
