package com.studio3104.leetcode.explore.interview.amazon.NumberOfIslands;

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
                        new char[][]{
                                {'1', '1', '1', '1', '0'},
                                {'1', '1', '0', '1', '0'},
                                {'1', '1', '0', '0', '0'},
                                {'0', '0', '0', '0', '0'},
                        },
                        1
                ),
                Arguments.of(
                        new char[][]{
                                {'1', '1', '0', '0', '0'},
                                {'1', '1', '0', '0', '0'},
                                {'0', '0', '1', '0', '0'},
                                {'0', '0', '0', '1', '1'},
                        },
                        3
                )
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void numIslands(char[][] grid, int expected) {
        int result = solution.numIslands(grid);
        Assertions.assertEquals(expected, result);
    }
}
