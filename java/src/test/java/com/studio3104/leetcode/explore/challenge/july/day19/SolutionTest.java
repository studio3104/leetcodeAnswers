package com.studio3104.leetcode.explore.challenge.july.day19;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SolutionTest {
    Solution solution = new Solution();

    @ParameterizedTest
    @CsvSource({
            "11, 1, 100",
            "1010, 1011, 10101"
    })
    void addBinary(String a, String b, String expected) {
        String result = solution.addBinary(a, b);
        Assertions.assertEquals(expected, result);
    }
}
