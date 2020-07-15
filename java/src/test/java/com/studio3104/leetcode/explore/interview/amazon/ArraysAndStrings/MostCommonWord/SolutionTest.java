package com.studio3104.leetcode.explore.interview.amazon.ArraysAndStrings.MostCommonWord;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    Solution solution = new Solution();

    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(
                        "Bob hit a ball, the hit BALL flew far after it was hit.",
                        new String[]{"hit"},
                        "ball"
                )
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void mostCommonWord(String paragraph, String[] banned, String expected) {
        String result = solution.mostCommonWord(paragraph, banned);
        Assertions.assertEquals(expected, result);
    }
}
