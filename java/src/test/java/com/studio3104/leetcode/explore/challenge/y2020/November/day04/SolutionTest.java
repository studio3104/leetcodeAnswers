package com.studio3104.leetcode.explore.challenge.y2020.November.day04;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

class SolutionTest {
    Solution solution = new Solution();

    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(4, new int[][]{{1, 0}, {1, 2}, {1, 3}}, List.of(1)),
                Arguments.of(6, new int[][]{{3, 0}, {3, 1}, {3, 2}, {3, 4}, {5, 4}}, List.of(3, 4)),
                Arguments.of(1, new int[][]{}, List.of(0)),
                Arguments.of(2, new int[][]{{0, 1}}, List.of(0, 1))
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void findMinHeightTrees(int n, int[][] edges, List<Integer> expected) {
        List<Integer> actual = solution.findMinHeightTrees(n, edges);
        Assertions.assertEquals(expected, actual);
    }
}
