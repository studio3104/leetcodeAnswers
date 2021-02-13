package com.studio3104.leetcode.explore.challenge.y2021.February.day13;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
//                Arguments.of(new int[][]{{0, 1}, {1, 0}}, 2),
//                Arguments.of(new int[][]{{0, 0, 0}, {1, 1, 0}, {1, 1, 0}}, 4),
                Arguments.of(new int[][]{{0, 0, 1, 0, 0, 0, 0}, {0, 1, 0, 0, 0, 0, 1}, {0, 0, 1, 0, 1, 0, 0}, {0, 0, 0, 1, 1, 1, 0}, {1, 0, 0, 1, 1, 0, 0}, {1, 1, 1, 1, 1, 0, 1}, {0, 0, 1, 0, 0, 0, 0}}, 10)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void shortestPathBinaryMatrix(int[][] grid, int expected) {
        Solution solution = new Solution();
        int actual = solution.shortestPathBinaryMatrix(grid);
        Assertions.assertEquals(expected, actual);
    }
}
