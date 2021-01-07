package com.studio3104.leetcode.explore.challenge.y2020.September.day03;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SolutionTest {
    Solution solution = new Solution();

    @ParameterizedTest
    @CsvSource({
            "abab, true",
            "aba, false",
            "abcabcabcabc, true",
            "ababcababc, true",
            "abababcabababc, true",
            "abababcababab, false"
    })
    void repeatedSubstringPattern(String s, boolean expected) {
        boolean result = solution.repeatedSubstringPattern(s);
        Assertions.assertEquals(expected, result);
    }
}
