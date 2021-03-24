package com.studio3104.leetcode.explore.challenge.y2021.March.day24;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(new int[]{2, 7, 11, 15}, new int[]{1, 10, 4, 11}, new int[]{2, 11, 7, 15}),
                Arguments.of(new int[]{12, 24, 8, 32}, new int[]{13, 25, 32, 11}, new int[]{24, 32, 8, 12}),
                Arguments.of(new int[]{2, 0, 4, 1, 2}, new int[]{1, 3, 0, 0, 2}, new int[]{2, 0, 1, 2, 4})
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void advantageCount(int[] A, int[] B, int[] expected) {
        Solution solution = new Solution();
        int[] actual = solution.advantageCount(A, B);
        Assertions.assertArrayEquals(expected, actual);
    }
}
