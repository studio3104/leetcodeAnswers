package com.studio3104.leetcode.explore.challenge.y2021.May.day05;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(new int[]{2, 3, 1, 1, 4}, 2),
                Arguments.of(new int[]{2, 3, 0, 1, 4}, 2)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void jump(int[] nums, int expected) {
        Solution solution = new Solution();
        int actual = solution.jump(nums);
        Assertions.assertEquals(expected, actual);
    }
}
