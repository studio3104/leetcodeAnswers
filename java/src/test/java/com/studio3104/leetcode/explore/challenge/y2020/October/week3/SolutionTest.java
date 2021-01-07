package com.studio3104.leetcode.explore.challenge.y2020.October.week3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    Solution solution = new Solution();

    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(new int[][]{{0, 30}, {5, 10}, {15, 20}}, 2),
                Arguments.of(new int[][]{{7, 10}, {2, 4}}, 1)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void minMeetingRooms(int[][] intervals, int expected) {
        int result = solution.minMeetingRooms(intervals);
        Assertions.assertEquals(expected, result);
    }
}
