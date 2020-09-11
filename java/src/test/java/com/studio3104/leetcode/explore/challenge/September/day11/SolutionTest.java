package com.studio3104.leetcode.explore.challenge.September.day11;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    Solution solution = new Solution();

    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(new int[]{2, 3, -2, 4}, 6),
                Arguments.of(new int[]{-2, 0, -1}, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void maxProduct(int[] nums, int expected) {
        int result = solution.maxProduct(nums);
        Assertions.assertEquals(expected, result);
    }
}
