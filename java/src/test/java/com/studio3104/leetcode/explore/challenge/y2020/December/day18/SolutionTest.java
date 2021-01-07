package com.studio3104.leetcode.explore.challenge.y2020.December.day18;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    Solution solution = new Solution();

    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 4, 5}, true),
                Arguments.of(new int[]{5, 4, 3, 2, 1}, false),
                Arguments.of(new int[]{2, 1, 5, 0, 4, 6}, true)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void increasingTriplet(int[] nums, boolean expected) {
        boolean actual = solution.increasingTriplet(nums);
        Assertions.assertEquals(expected, actual);
    }
}
