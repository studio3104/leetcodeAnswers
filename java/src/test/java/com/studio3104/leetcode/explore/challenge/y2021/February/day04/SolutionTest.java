package com.studio3104.leetcode.explore.challenge.y2021.February.day04;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(new int[]{1, 3, 2, 2, 5, 2, 3, 7}, 5),
                Arguments.of(new int[]{1, 2, 3, 4}, 2),
                Arguments.of(new int[]{1, 1, 1, 1}, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void findLHS(int[] nums, int expected) {
        Solution solution = new Solution();
        int actual = solution.findLHS(nums);
        Assertions.assertEquals(expected, actual);
    }
}
