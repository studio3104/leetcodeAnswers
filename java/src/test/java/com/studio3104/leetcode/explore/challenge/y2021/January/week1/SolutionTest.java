package com.studio3104.leetcode.explore.challenge.y2021.January.week1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SolutionTest {
    Solution solution = new Solution();

    @ParameterizedTest
    @CsvSource({
            "code, false",
            "aab, true",
            "carerac, true",
            "AaBb//a, false",
    })
    void canPermutePalindrome(String s, boolean expected) {
        boolean actual = solution.canPermutePalindrome(s);
        Assertions.assertEquals(expected, actual);
    }
}
