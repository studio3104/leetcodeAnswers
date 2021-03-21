package com.studio3104.leetcode.explore.challenge.y2021.March.day21;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SolutionTest {
    @ParameterizedTest
    @CsvSource({
            "1, true",
            "10, false",
            "16, true",
            "24, false",
            "46, true",
    })
    void reorderedPowerOf2(int N, boolean expected) {
        Solution solution = new Solution();
        boolean actual = solution.reorderedPowerOf2(N);
        Assertions.assertEquals(expected, actual);
    }
}
