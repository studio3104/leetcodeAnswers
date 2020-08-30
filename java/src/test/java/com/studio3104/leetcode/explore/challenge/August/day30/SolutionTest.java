package com.studio3104.leetcode.explore.challenge.August.day30;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    Solution solution = new Solution();

    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(new int[]{4, 6, 15, 35}, 4),
                Arguments.of(new int[]{20, 50, 9, 63}, 2),
                Arguments.of(new int[]{2, 3, 6, 7, 4, 12, 21, 39}, 8)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void largestComponentSize(int[] A, int expected) {
        int result = solution.largestComponentSize(A);
        Assertions.assertEquals(expected, result);
    }
}
