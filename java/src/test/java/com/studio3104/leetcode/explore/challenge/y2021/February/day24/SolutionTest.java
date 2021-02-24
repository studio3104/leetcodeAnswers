package com.studio3104.leetcode.explore.challenge.y2021.February.day24;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SolutionTest {
    @ParameterizedTest
    @CsvSource({
            "(), 1",
            "(()), 2",
            "()(), 2",
            "(()(())), 6",
    })
    void scoreOfParentheses(String s, int expected) {
        Solution solution = new Solution();
        int actual = solution.scoreOfParentheses(s);
        Assertions.assertEquals(expected, actual);
    }
}
