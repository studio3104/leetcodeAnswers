package com.studio3104.leetcode.explore.challenge.September.day17;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SolutionTest {
    Solution solution = new Solution();

    @ParameterizedTest
    @CsvSource({
            "GGLLGG, true",
            "GG, false",
            "GL, true",
    })
    void isRobotBounded(String instructions, boolean expected) {
        boolean result = solution.isRobotBounded(instructions);
        Assertions.assertEquals(expected, result);
    }
}
