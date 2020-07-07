package com.studio3104.leetcode.explore.challenge.july.day07;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    Solution solution = new Solution();

    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(
                        new int[][]{
                                new int[]{0, 1, 0, 0},
                                new int[]{1, 1, 1, 0},
                                new int[]{0, 1, 0, 0},
                                new int[]{1, 1, 0, 0},
                        }, 16
                ),
                Arguments.of(
                        new int[][]{
                                new int[]{1,1},
                                new int[]{1,1},
                        }, 8
                )
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void islandPerimeter(int[][] grid, int expected) {
        int result = solution.islandPerimeter(grid);
        assertEquals(expected, result);
    }
}

class Solution2Test extends SolutionTest {
    Solution2 solution = new Solution2();

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void islandPerimeter(int[][] grid, int expected) {
        int result = solution.islandPerimeter(grid);
        assertEquals(expected, result);
    }
}
