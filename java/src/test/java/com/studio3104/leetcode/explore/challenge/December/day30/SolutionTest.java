package com.studio3104.leetcode.explore.challenge.December.day30;

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
                                {0, 1, 0},
                                {0, 0, 1},
                                {1, 1, 1},
                                {0, 0, 0},
                        },
                        new int[][]{
                                {0, 0, 0},
                                {1, 0, 1},
                                {0, 1, 1},
                                {0, 1, 0},
                        }
                ),
                Arguments.of(
                        new int[][]{
                                {1, 1},
                                {1, 0},
                        },
                        new int[][]{
                                {1, 1},
                                {1, 1},
                        }
                )
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void gameOfLife(int[][] board, int[][] expected) {
        solution.gameOfLife(board);
        Assertions.assertArrayEquals(expected, board);
    }
}
