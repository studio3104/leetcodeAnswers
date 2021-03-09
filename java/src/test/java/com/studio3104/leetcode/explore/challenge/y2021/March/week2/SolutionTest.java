package com.studio3104.leetcode.explore.challenge.y2021.March.week2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SolutionTest {
    @ParameterizedTest
    @CsvSource({
            "69, true",
            "88, true",
            "962, false",
            "1, true",
    })
    void isStrobogrammatic(String num, boolean expected) {
        Solution solution = new Solution();
        boolean actual = solution.isStrobogrammatic(num);
        Assertions.assertEquals(expected, actual);
    }
}
