package com.studio3104.leetcode.explore.challenge.November.day30;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    Solution solution = new Solution();

    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(new int[]{4, 2, 3, 0, 3, 1, 2}, 5, true),
                Arguments.of(new int[]{4, 2, 3, 0, 3, 1, 2}, 0, true),
                Arguments.of(new int[]{3, 0, 2, 1, 2}, 2, false)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void canReach(int[] arr, int start, boolean expected) {
        boolean actual = solution.canReach(arr, start);
        Assertions.assertEquals(expected, actual);
    }
}
