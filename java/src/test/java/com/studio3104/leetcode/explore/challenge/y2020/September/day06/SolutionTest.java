package com.studio3104.leetcode.explore.challenge.y2020.September.day06;

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
                        new int[][]{{1, 1, 0}, {0, 1, 0}, {0, 1, 1}},
                        new int[][]{{0, 0, 0}, {0, 1, 1}, {0, 0, 1}},
                        3
                ),
                Arguments.of(
                        new int[][]{{0, 1}, {1, 1}},
                        new int[][]{{1, 1}, {1, 0}},
                        2
                )
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void largestOverlap(int[][] A, int[][] B, int expected) {
        int result = solution.largestOverlap(A, B);
        Assertions.assertEquals(expected, result);
    }
}
