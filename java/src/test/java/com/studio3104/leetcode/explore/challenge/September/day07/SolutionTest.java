package com.studio3104.leetcode.explore.challenge.September.day07;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SolutionTest {
    Solution solution = new Solution();

    @ParameterizedTest
    @CsvSource({
            "abba, dog cat cat dog, true",
            "abba, dog cat cat fish, false",
            "aaaa, dog cat cat dog, false",
            "abba, dog dog dog dog, false"
    })
    void wordPattern(String pattern, String str, boolean expected) {
        boolean result = solution.wordPattern(pattern, str);
        Assertions.assertEquals(expected, result);
    }
}
