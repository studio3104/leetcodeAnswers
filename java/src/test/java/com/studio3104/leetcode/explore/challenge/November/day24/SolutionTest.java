package com.studio3104.leetcode.explore.challenge.November.day24;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SolutionTest {
    Solution solution = new Solution();

    @ParameterizedTest
    @CsvSource({
            "3+2*2, 7",
            " 3/2 , 1",
            " 3+5 / 2 , 5",
            "1, 1",
            "2*3+4, 10",
    })
    void calculate(String s, int expected) {
        int actual = solution.calculate(s);
        Assertions.assertEquals(expected, actual);
    }
}
