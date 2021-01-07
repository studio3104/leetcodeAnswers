package com.studio3104.leetcode.explore.challenge.y2020.December.day07;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    Solution solution = new Solution();

    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(3, new int[][]{{1, 2, 3}, {8, 9, 4}, {7, 6, 5}}),
                Arguments.of(1, new int[][]{{1}})
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void generateMatrix(int n, int[][] expected) {
        int[][] actual = solution.generateMatrix(n);
        Assertions.assertArrayEquals(expected, actual);
    }
}
