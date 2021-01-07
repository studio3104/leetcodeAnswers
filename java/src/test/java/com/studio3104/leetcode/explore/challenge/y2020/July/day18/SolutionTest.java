package com.studio3104.leetcode.explore.challenge.y2020.July.day18;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    Solution solution = new Solution();

    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(2, new int[][]{{1, 0}}, new int[]{0, 1}),
                Arguments.of(
                        4, new int[][]{{1, 0}, {2, 0}, {3, 1}, {3, 2}},
                        new int[]{0, 2, 1, 3}
                )
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void findOrder(int numCourses, int[][] prerequisites, int[] expected) {
        int[] result = solution.findOrder(numCourses, prerequisites);
        Assertions.assertArrayEquals(expected, result);
    }
}
