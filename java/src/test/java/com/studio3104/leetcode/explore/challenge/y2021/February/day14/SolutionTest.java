package com.studio3104.leetcode.explore.challenge.y2021.February.day14;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(new int[][]{{1, 3}, {0, 2}, {1, 3}, {0, 2}}, true),
                Arguments.of(new int[][]{{1, 2, 3}, {0, 2}, {0, 1, 3}, {0, 2}}, false)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void isBipartite(int[][] grid, boolean expected) {
        Solution solution = new Solution();
        boolean actual = solution.isBipartite(grid);
        Assertions.assertEquals(expected, actual);
    }
}
