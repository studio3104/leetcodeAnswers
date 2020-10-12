package com.studio3104.leetcode.explore.challenge.October.day12;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SolutionTest {
    Solution solution = new Solution();

    @ParameterizedTest
    @CsvSource({
            "ab, ba, true",
            "ab, ab, false",
            "aa, aa, true",
            "aaaaaaabc, aaaaaaacb, true",
            "a, aa, false",
            "abab, abab, true",
            "ababa, ababa, true",
            "aaab, aaab, true",
            "abab, baba, false",
    })
    void buddyStrings(String A, String B, boolean expected) {
        boolean result = solution.buddyStrings(A, B);
        Assertions.assertEquals(expected, result);
    }
}
