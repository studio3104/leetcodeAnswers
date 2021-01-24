package com.studio3104.leetcode.explore.challenge.y2021.January.day23;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(
                        new int[][]{{3, 3, 1, 1}, {2, 2, 1, 2}, {1, 1, 1, 2}},
                        new int[][]{{1, 1, 1, 1}, {1, 2, 2, 2}, {1, 2, 3, 3}}
                )
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void diagonalSort(int[][] mat, int[][] expected) {
        Solution solution = new Solution();
        Assertions.assertArrayEquals(expected, solution.diagonalSort(mat));
    }
}
