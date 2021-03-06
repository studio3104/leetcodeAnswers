package com.studio3104.leetcode.explore.challenge.y2020.August.day01.DetectCapital;

import com.studio3104.leetcode.explore.challenge.y2020.August.day01.Solution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SolutionTest {
    Solution solution = new Solution();

    @ParameterizedTest
    @CsvSource({
            "USA, true",
            "FlaG, false",
            "mL, false"
    })
    void detectCapitalUse(String word, boolean expected) {
        boolean result = solution.detectCapitalUse(word);
        Assertions.assertEquals(expected, result);
    }
}
