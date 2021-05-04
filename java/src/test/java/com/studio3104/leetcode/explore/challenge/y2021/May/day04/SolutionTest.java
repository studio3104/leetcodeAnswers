package com.studio3104.leetcode.explore.challenge.y2021.May.day04;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(new int[]{4, 2, 3}, true),
                Arguments.of(new int[]{4, 2, 1}, false),
                Arguments.of(new int[]{3, 4, 2, 3}, false)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void checkPossibility(int[] nums, boolean expected) {
        Solution solution = new Solution();
        boolean actual = solution.checkPossibility(nums);
        Assertions.assertEquals(expected, actual);
    }
}
