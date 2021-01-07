package com.studio3104.leetcode.explore.challenge.y2020.July.day24;

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
                Arguments.of(
                        new int[][]{{1, 2}, {3}, {3}, {}},
                        List.of(List.of(0, 1, 3), List.of(0, 2, 3))
                )
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void allPathsSourceTarget(int[][] graph, List<List<Integer>> expected) {
        List<List<Integer>> result = solution.allPathsSourceTarget(graph);
        Assertions.assertEquals(expected, result);
    }
}
