package com.studio3104.leetcode.explore.challenge.August.week04;

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
                        new int[][]{
                                {0, 0, 1, 0, 0},
                                {0, 0, 0, 0, 0},
                                {0, 0, 0, 1, 0},
                                {1, 1, 0, 1, 1},
                                {0, 0, 0, 0, 0}
                        },
                        new int[]{0, 4},
                        new int[]{4, 4},
                        true
                ),
                Arguments.of(
                        new int[][]{
                                {0, 0, 1, 0, 0},
                                {0, 0, 0, 0, 0},
                                {0, 0, 0, 1, 0},
                                {1, 1, 0, 1, 1},
                                {0, 0, 0, 0, 0}
                        },
                        new int[]{0, 4},
                        new int[]{3, 2},
                        false
                ),
                Arguments.of(
                        new int[][]{
                                {0, 0, 0, 0, 1, 0, 0},
                                {0, 0, 1, 0, 0, 0, 0},
                                {0, 0, 0, 0, 0, 0, 0},
                                {0, 0, 0, 0, 0, 0, 1},
                                {0, 1, 0, 0, 0, 0, 0},
                                {0, 0, 0, 1, 0, 0, 0},
                                {0, 0, 0, 0, 0, 0, 0},
                                {0, 0, 1, 0, 0, 0, 1},
                                {0, 0, 0, 0, 1, 0, 0}
                        },
                        new int[]{0, 0},
                        new int[]{8, 6},
                        true
                )
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void hasPath(int[][] maze, int[] start, int[] destination, boolean expected) {
        boolean result = solution.hasPath(maze, start, destination);
        Assertions.assertEquals(expected, result);
    }
}
