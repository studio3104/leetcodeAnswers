package com.studio3104.leetcode.Problems.p0252MeetingRooms;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    Solution solution = new Solution();

    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(new int[][]{{0, 30}, {5, 10}, {15, 20}}, false),
                Arguments.of(new int[][]{{7, 10}, {2, 4}}, true)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void canAttendMeetings(int[][] intervals, boolean expected) {
        boolean result = solution.canAttendMeetings(intervals);
        Assertions.assertEquals(expected, result);
    }
}
