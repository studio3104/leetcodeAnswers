package com.studio3104.leetcode.explore.challenge.y2020.September.day15;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SolutionTest {
    Solution solution = new Solution();

    @ParameterizedTest
    @CsvSource({
            "Hello World, 5",
    })
    void lengthOfLastWord(String s, int expected) {
        int result = solution.lengthOfLastWord(s);
        Assertions.assertEquals(expected, result);
    }
}
