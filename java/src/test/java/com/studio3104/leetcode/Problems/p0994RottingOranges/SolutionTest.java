package com.studio3104.leetcode.Problems.p0994RottingOranges;

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
                                {2, 1, 1},
                                {1, 1, 0},
                                {0, 1, 1},
                        }, 4
                ),
                Arguments.of(
                        new int[][]{
                                {2, 1, 1},
                                {0, 1, 1},
                                {1, 0, 1}
                        }, -1
                ),
                Arguments.of(new int[][]{{0, 2}}, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void orangesRotting(int[][] grid, int expected) {
        int result = solution.orangesRotting(grid);
        Assertions.assertEquals(expected, result);
    }
}
