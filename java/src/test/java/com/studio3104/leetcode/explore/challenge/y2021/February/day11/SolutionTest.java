package com.studio3104.leetcode.explore.challenge.y2021.February.day11;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SolutionTest {
    @ParameterizedTest
    @CsvSource({
            "anagram, nagaram, true",
            "rat, car, false",
    })
    void isAnagram(String s, String t, boolean expected) {
        Solution solution = new Solution();
        boolean actual = solution.isAnagram(s, t);
        Assertions.assertEquals(expected, actual);
    }
}
