package com.studio3104.leetcode.explore.interview.amazon.ArraysAndStrings.SetMatrixZeroes;

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
                                {1, 0},
                        },
                        new int[][]{
                                {0, 0},
                        }
                ),
                Arguments.of(
                        new int[][]{
                                {1, 1, 1},
                                {1, 0, 1},
                                {1, 1, 1},
                        },
                        new int[][]{
                                {1, 0, 1},
                                {0, 0, 0},
                                {1, 0, 1},
                        }
                ),
                Arguments.of(
                        new int[][]{
                                {0, 1, 2, 0},
                                {3, 4, 5, 2},
                                {1, 3, 1, 5},
                        },
                        new int[][]{
                                {0, 0, 0, 0},
                                {0, 4, 5, 0},
                                {0, 3, 1, 0},
                        }
                ),
                Arguments.of(
                        new int[][]{
                                {1, 2, 3, 4},
                                {5, 0, 7, 8},
                                {0, 10, 11, 12},
                                {13, 14, 15, 0},
                        },
                        new int[][]{
                                {0, 0, 3, 0},
                                {0, 0, 0, 0},
                                {0, 0, 0, 0},
                                {0, 0, 0, 0},
                        }
                )
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void setZeroes(int[][] matrix, int[][] expected) {
        solution.setZeroes(matrix);
        Assertions.assertArrayEquals(expected, matrix);
    }
}
