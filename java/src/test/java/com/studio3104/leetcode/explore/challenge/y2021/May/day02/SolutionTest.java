package com.studio3104.leetcode.explore.challenge.y2021.May.day02;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(new int[][]{{100, 200}, {200, 1300}, {1000, 1250}, {2000, 3200}}, 3),
                Arguments.of(new int[][]{{1, 2}}, 1),
                Arguments.of(new int[][]{{3, 2}, {4, 3}}, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void scheduleCourse(int[][] courses, int expected) {
        Solution solution = new Solution();
        int actual = solution.scheduleCourse(courses);
        Assertions.assertEquals(expected, actual);
    }
}
