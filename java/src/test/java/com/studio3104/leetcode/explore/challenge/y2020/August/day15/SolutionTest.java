package com.studio3104.leetcode.explore.challenge.y2020.August.day15;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    Solution solution = new Solution();

    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(new int[][]{{1, 2}, {2, 3}, {3, 4}, {1, 3}} , 1),
                Arguments.of(new int[][]{{1, 2}, {1, 2}, {1, 2}}, 2),
                Arguments.of(new int[][]{{1, 2}, {2, 3}}, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void eraseOverlapIntervals(int[][] intervals, int expected) {
        int result = solution.eraseOverlapIntervals(intervals);
        Assertions.assertEquals(expected, result);
    }
}
