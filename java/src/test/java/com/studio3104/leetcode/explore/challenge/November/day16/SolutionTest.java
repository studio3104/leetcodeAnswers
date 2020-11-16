package com.studio3104.leetcode.explore.challenge.November.day16;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    Solution solution = new Solution();

    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(new int[]{2, 1, 4, 7, 3, 2, 5}, 5),
                Arguments.of(new int[]{2, 2, 2}, 0),
                Arguments.of(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, 0),
                Arguments.of(new int[]{0, 1, 0}, 3)
        );
    }
    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void longestMountain(int[] A, int expected) {
        int actual = solution.longestMountain(A);
        Assertions.assertEquals(expected, actual);
    }
}
