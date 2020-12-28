package com.studio3104.leetcode.explore.challenge.December.day28;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SolutionTest {
    Solution solution = new Solution();

    @ParameterizedTest
    @CsvSource({
            "3, 2",
            "2, 3",
    })
    void reachNumber(int target, int expected) {
        int actual = solution.reachNumber(target);
        Assertions.assertEquals(expected, actual);
    }
}
