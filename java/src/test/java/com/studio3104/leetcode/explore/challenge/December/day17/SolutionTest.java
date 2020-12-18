package com.studio3104.leetcode.explore.challenge.December.day17;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    Solution solution = new Solution();

    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(new int[]{1, 2}, new int[]{-2, -1}, new int[]{-1, 2}, new int[]{0, 2}, 2)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void fourSumCount(int[] A, int[] B, int[] C, int[] D, int expected) {
        int actual = solution.fourSumCount(A, B, C, D);
        Assertions.assertEquals(expected, actual);
    }
}
