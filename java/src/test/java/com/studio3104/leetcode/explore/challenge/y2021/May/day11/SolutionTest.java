package com.studio3104.leetcode.explore.challenge.y2021.May.day11;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 4, 5, 6, 1}, 3, 12),
                Arguments.of(new int[]{2, 2, 2}, 2, 4),
                Arguments.of(new int[]{9, 7, 7, 9, 7, 7, 9}, 7, 55),
                Arguments.of(new int[]{1, 1000, 1}, 1, 1),
                Arguments.of(new int[]{1, 79, 80, 1, 1, 1, 200, 1}, 3, 202),
                Arguments.of(new int[]{100, 40, 17, 9, 73, 75}, 3, 248)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void maxScore(int[] cardPoints, int k, int expected) {
        Solution solution = new Solution();
        int actual = solution.maxScore(cardPoints, k);
        Assertions.assertEquals(expected, actual);
    }
}
