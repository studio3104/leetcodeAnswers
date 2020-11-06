package com.studio3104.leetcode.explore.challenge.November.day06;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    Solution solution = new Solution();

    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 5, 9}, 6, 5),
                Arguments.of(new int[]{2, 3, 5, 7, 11}, 11, 3),
                Arguments.of(new int[]{19}, 5, 4)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void smallestDivisor(int[] nums, int threshold, int expected) {
        int actual = solution.smallestDivisor(nums, threshold);
        Assertions.assertEquals(expected, actual);
    }
}
