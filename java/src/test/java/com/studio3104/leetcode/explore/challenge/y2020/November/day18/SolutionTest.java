package com.studio3104.leetcode.explore.challenge.y2020.November.day18;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    Solution solution = new Solution();

    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(new int[][]{{1, 3}, {2, 6}, {8, 10}, {15, 18}}, new int[][]{{1, 6}, {8, 10}, {15, 18}}),
                Arguments.of(new int[][]{{1, 4}, {4, 5}}, new int[][]{{1, 5}})
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void merge(int[][] intervals, int[][] expected) {
        int[][] actual = solution.merge(intervals);
        Assertions.assertArrayEquals(expected, actual);
    }
}
