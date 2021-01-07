package com.studio3104.leetcode.explore.challenge.y2020.September.day28;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    Solution solution = new Solution();

    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(new int[]{10, 5, 2, 6}, 100, 8)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void numSubarrayProductLessThanK(int[] nums, int k, int expected) {
        int result = solution.numSubarrayProductLessThanK(nums, k);
        Assertions.assertEquals(expected, result);
    }
}
