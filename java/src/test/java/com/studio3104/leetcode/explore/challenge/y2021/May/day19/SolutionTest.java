package com.studio3104.leetcode.explore.challenge.y2021.May.day19;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3}, 2),
                Arguments.of(new int[]{1, 10, 2, 9}, 16),
                Arguments.of(new int[]{1, 0, 0, 8, 6}, 14)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void minMoves2(int[] nums, int expected) {
        Solution solution = new Solution();
        int actual = solution.minMoves2(nums);
        Assertions.assertEquals(expected, actual);
    }
}
