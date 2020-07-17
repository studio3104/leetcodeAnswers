package com.studio3104.leetcode.explore.challenge.july.day17;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    Solution solution = new Solution();

    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(
                        new int[]{1, 1, 1, 2, 2, 3}, 2,
                        new int[]{1, 2}
                ),
                Arguments.of(
                        new int[]{1}, 1,
                        new int[]{1}
                )
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void topKFrequent(int[] nums, int k, int[] expected) {
        int[] result = solution.topKFrequent(nums, k);
        Assertions.assertArrayEquals(expected, result);
    }
}
