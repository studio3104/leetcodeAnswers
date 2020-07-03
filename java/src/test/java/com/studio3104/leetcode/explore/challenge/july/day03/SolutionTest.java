package com.studio3104.leetcode.explore.challenge.july.day03;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {
    Solution solution = new Solution();

    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(
                        new int[]{0, 1, 0, 1, 1, 0, 0, 1}, 1,
                        new int[]{0, 1, 1, 0, 0, 0, 0, 0}
                ),
                Arguments.of(
                        new int[]{0, 1, 0, 1, 1, 0, 0, 1}, 7,
                        new int[]{0, 0, 1, 1, 0, 0, 0, 0}
                ),
                Arguments.of(
                        new int[]{1, 0, 0, 1, 0, 0, 1, 0}, 1000000000,
                        new int[]{0, 0, 1, 1, 1, 1, 1, 0}
                ),
                Arguments.of(
                        new int[]{0, 0, 0, 1, 1, 0, 1, 0}, 574,
                        new int[]{0, 0, 0, 1, 1, 0, 1, 0}
                )
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void prisonAfterNDays(int[] cells, int N, int[] expected) {
        int[] result = solution.prisonAfterNDays(cells, N);
        assertArrayEquals(result, expected);
    }
}
