package com.studio3104.leetcode.explore.challenge.September.day01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    Solution solution = new Solution();

    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 4}, "23:41"),
                Arguments.of(new int[]{5, 5, 5, 5}, ""),
                Arguments.of(new int[]{2, 0, 6, 6}, "06:26")
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void largestTimeFromDigits(int[] A, String expected) {
        String result = solution.largestTimeFromDigits(A);
        Assertions.assertEquals(expected, result);
    }
}
