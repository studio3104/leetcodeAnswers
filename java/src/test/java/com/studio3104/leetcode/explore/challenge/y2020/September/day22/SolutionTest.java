package com.studio3104.leetcode.explore.challenge.y2020.September.day22;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

class SolutionTest {
    Solution solution = new Solution();

    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(new int[]{3, 2, 3}, List.of(3)),
                Arguments.of(new int[]{1, 1, 1, 3, 3, 2, 2, 2}, List.of(1, 2))
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void majorityElement(int[] nums, List<Integer> expected) {
        List<Integer> result = solution.majorityElement(nums);
        Assertions.assertEquals(expected, result);
    }
}
