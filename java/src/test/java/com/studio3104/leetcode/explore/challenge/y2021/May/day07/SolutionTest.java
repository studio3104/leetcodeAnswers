package com.studio3104.leetcode.explore.challenge.y2021.May.day07;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SolutionTest {
    @ParameterizedTest
    @CsvSource({
            "sea, eat, 2",
            "leetcode, etco, 4",
    })
    void minDistance(String word1, String word2, int expected) {
        Solution solution = new Solution();
        int actual = solution.minDistance(word1, word2);
        Assertions.assertEquals(expected, actual);
    }
}
