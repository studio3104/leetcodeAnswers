package com.studio3104.leetcode.explore.challenge.july.day23;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    Solution solution = new Solution();

    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 1, 3, 2, 5}, new int[]{3, 5})
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void singleNumber(int[] nums, int[] expected) {
        int[] result = solution.singleNumber(nums);
        Assertions.assertArrayEquals(expected, result);
    }
}
