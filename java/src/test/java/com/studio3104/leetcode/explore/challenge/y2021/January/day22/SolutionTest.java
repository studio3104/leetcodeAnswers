package com.studio3104.leetcode.explore.challenge.y2021.January.day22;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SolutionTest {
    @ParameterizedTest
    @CsvSource({
            "abc, bca, true",
            "a, aa, false",
            "cabbba, abbccc, true",
            "cabbba, aabbss, false",
    })
    void closeStrings(String word1, String word2, boolean expected) {
        Solution solution = new Solution();
        Assertions.assertEquals(expected, solution.closeStrings(word1, word2));
    }
}
