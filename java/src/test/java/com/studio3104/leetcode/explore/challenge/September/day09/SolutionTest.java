package com.studio3104.leetcode.explore.challenge.September.day09;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SolutionTest {
    Solution solution = new Solution();

    @ParameterizedTest
    @CsvSource({
            "0.1, 1.1, -1",
            "1.0.1, 1, 1",
            "7.5.2.4, 7.5.3, -1",
            "1.01, 1.001, 0",
            "1.0, 1.0.0, 0"
    })
    void compareVersion(String version1, String version2, int expected) {
        int result = solution.compareVersion(version1, version2);
        Assertions.assertEquals(expected, result);
    }
}
