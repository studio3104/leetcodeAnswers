package com.studio3104.leetcode.explore.challenge.y2021.March.day02;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 2, 4}, new int[]{2, 3}),
                Arguments.of(new int[]{1, 1}, new int[]{1, 2})
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void findErrorNums(int[] nums, int[] expected) {
        Solution solution = new Solution();
        int[] actual = solution.findErrorNums(nums);
        Assertions.assertArrayEquals(expected, actual);
    }
}
