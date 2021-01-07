package com.studio3104.leetcode.explore.challenge.y2020.December.week1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    Solution solution = new Solution();

    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(new String[]{"practice", "makes", "perfect", "coding", "makes"}, "coding", "practice", 3),
                Arguments.of(new String[]{"practice", "makes", "perfect", "coding", "makes"}, "makes", "coding", 1)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void shortestDistance(String[] words, String word1, String word2, int expected) {
        int actual = solution.shortestDistance(words, word1, word2);
        Assertions.assertEquals(expected, actual);
    }
}
