package com.studio3104.leetcode.explore.challenge.y2020.October.day16;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    Solution solution = new Solution();

    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 50}}, 3, true),
                Arguments.of(new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 50}}, 13, false),
                Arguments.of(new int[][]{}, 0, false),
                Arguments.of(new int[][]{{1}}, 1, true),
                Arguments.of(new int[][]{{1, 3}}, 3, true),
                Arguments.of(new int[][]{{1}, {3}}, 2, false)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void searchMatrix(int[][] matrix, int target, boolean expected) {
        boolean result = solution.searchMatrix(matrix, target);
        Assertions.assertEquals(expected, result);
    }
}
