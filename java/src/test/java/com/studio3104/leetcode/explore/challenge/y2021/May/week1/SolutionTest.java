package com.studio3104.leetcode.explore.challenge.y2021.May.week1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(5, new int[][]{{0, 1}, {1, 2}, {3, 4}}, 2),
                Arguments.of(5, new int[][]{{0, 1}, {1, 2}, {2, 3}, {3, 4}}, 1),
                Arguments.of(4, new int[][]{{2, 3}, {1, 2}, {1, 3}}, 2)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void countComponents(int n, int[][] edges, int expected) {
        Solution solution = new Solution();
        int actual = solution.countComponents(n, edges);
        Assertions.assertEquals(expected, actual);
    }
}
