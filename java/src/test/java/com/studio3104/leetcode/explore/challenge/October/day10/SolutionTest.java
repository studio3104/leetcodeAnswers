package com.studio3104.leetcode.explore.challenge.October.day10;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    Solution solution = new Solution();

    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(new int[][]{{10, 16}, {2, 8}, {1, 6}, {7, 12}}, 2),
                Arguments.of(new int[][]{{1, 2}, {3, 4}, {5, 6}, {7, 8}}, 4),
                Arguments.of(new int[][]{{1, 2}, {2, 3}, {3, 4}, {4, 5}}, 2),
                Arguments.of(new int[][]{{1, 2}}, 1),
                Arguments.of(new int[][]{{2, 3}, {2, 3}}, 1),
                Arguments.of(new int[][]{{Integer.MIN_VALUE, Integer.MAX_VALUE}}, 1),
                Arguments.of(new int[][]{{-2147483646, -2147483645}, {2147483646, 2147483647}}, 2),
                Arguments.of(new int[][]{{9, 12}, {1, 10}, {4, 11}, {8, 12}, {3, 9}, {6, 9}, {6, 7}}, 2)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void findMinArrowShots(int[][] points, int expected) {
        int result = solution.findMinArrowShots(points);
        Assertions.assertEquals(expected, result);
    }
}
