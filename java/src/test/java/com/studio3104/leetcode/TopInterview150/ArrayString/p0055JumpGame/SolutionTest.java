package com.studio3104.leetcode.TopInterview150.ArrayString.p0055JumpGame;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    Solution solution = new Solution();

    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(new int[]{2, 3, 1, 1, 4}, true),
                Arguments.of(new int[]{3, 2, 1, 0, 4}, false)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void removeElement(int[] nums, boolean expected) {
        boolean result = solution.canJump(nums);
        Assertions.assertEquals(expected, result);
    }
}