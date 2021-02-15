package com.studio3104.leetcode.explore.challenge.y2021.February.day15;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(
                        new int[][]{
                                {1, 1, 0, 0, 0},
                                {1, 1, 1, 1, 0},
                                {1, 0, 0, 0, 0},
                                {1, 1, 0, 0, 0},
                                {1, 1, 1, 1, 1}
                        },
                        3,
                        new int[]{2, 0, 3}
                ),
                Arguments.of(
                        new int[][]{
                                {1, 0, 0, 0},
                                {1, 1, 1, 1},
                                {1, 0, 0, 0},
                                {1, 0, 0, 0}
                        },
                        2,
                        new int[]{0, 2}
                )
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void kWeakestRows(int[][] mat, int k, int[] expected) {
        Solution solution = new Solution();
        int[] actual = solution.kWeakestRows(mat, k);
        Assertions.assertArrayEquals(expected, actual);
    }
}
