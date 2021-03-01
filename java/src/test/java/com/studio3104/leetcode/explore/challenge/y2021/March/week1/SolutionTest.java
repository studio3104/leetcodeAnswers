package com.studio3104.leetcode.explore.challenge.y2021.March.week1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SolutionTest {
    @ParameterizedTest
    @CsvSource({
            "abcdefghijklmnopqrstuvwxyz, cba, 4",
            "pqrstuvwxyzabcdefghijklmno, leetcode, 73",
    })
    void calculateTime(String keyboard, String word, int expected) {
        Solution solution = new Solution();
        int actual = solution.calculateTime(keyboard, word);
        Assertions.assertEquals(expected, actual);
    }
}
