package com.studio3104.leetcode.explore.challenge.y2021.February.week2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(new int[][]{{1, 1, 0, 0, 0}, {1, 1, 0, 0, 0}, {0, 0, 0, 1, 1}, {0, 0, 0, 1, 1}}, 1),
                Arguments.of(new int[][]{{1, 1, 0, 1, 1}, {1, 0, 0, 0, 0}, {0, 0, 0, 0, 1}, {1, 1, 0, 1, 1}}, 3)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void numDistinctIslands(int[][] grid, int expected) {
        Solution solution = new Solution();
        int actual = solution.numDistinctIslands(grid);
        Assertions.assertEquals(expected, actual);
    }
}
