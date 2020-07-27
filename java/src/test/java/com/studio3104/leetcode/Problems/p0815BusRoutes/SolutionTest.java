package com.studio3104.leetcode.Problems.p0815BusRoutes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    Solution solution = new Solution();

    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(new int[][]{{1, 2, 7}, {3, 6, 7}}, 1, 6, 2),
                Arguments.of(new int[][]{{1, 2, 7}, {3, 6, 7}, {3, 4, 8}}, 1, 4, 3),
                Arguments.of(
                        new int[][]{
                                {15, 17},
                                {7, 14, 16, 19, 23, 29},
                                {1, 5, 11, 13, 16, 27},
                                {4, 22},
                                {1, 6, 19, 25},
                                {9, 18, 21}
                        }, 11, 22, -1
                ),
                Arguments.of(
                        new int[][]{
                                {1, 9, 12, 20, 23, 24, 35, 38},
                                {10, 21, 24, 31, 32, 34, 37, 38, 43},
                                {10, 19, 28, 37},
                                {8},
                                {14, 19},
                                {11, 17, 23, 31, 41, 43, 44},
                                {21, 26, 29, 33},
                                {5, 11, 33, 41},
                                {4, 5, 8, 9, 24, 44}
                        }, 37, 28, 1
                ),
                Arguments.of(
                        new int[][]{
                                {0, 1, 6, 16, 22, 23},
                                {14, 15, 24, 32},
                                {4, 10, 12, 20, 24, 28, 33},
                                {1, 10, 11, 19, 27, 33},
                                {11, 23, 25, 28},
                                {15, 20, 21, 23, 29},
                                {29}
                        }, 4, 21, 2
                ),
                Arguments.of(new int[][]{{1, 7}, {3, 5}}, 5, 5, 0),
                Arguments.of(
                        new int[][]{{1}, {15, 16, 18}, {10}, {3, 4, 12, 14}},
                        3, 15, -1
                )
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void numBusesToDestination(int[][] routes, int S, int T, int expected) {
        int result = solution.numBusesToDestination(routes, S, T);
        Assertions.assertEquals(expected, result);
    }
}