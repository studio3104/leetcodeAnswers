package com.studio3104.leetcode.explore.challenge.y2020.October.day11;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SolutionTest {
    Solution solution = new Solution();

    @ParameterizedTest
    @CsvSource({
            "bcabc, abc",
            "cbacdcbc, acdb",
            "ecbacba, eacb",
    })
    void removeDuplicateLetters(String s, String expected) {
        String result = solution.removeDuplicateLetters(s);
        Assertions.assertEquals(expected, result);
    }
}
