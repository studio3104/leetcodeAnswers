package com.studio3104.leetcode.explore.challenge.y2020.September.day16;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    Solution solution = new Solution();

    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(new int[]{3, 10, 5, 25, 2, 8}, 28)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void findMaximumXOR(int[] nums, int expected) {
        int result = solution.findMaximumXOR(nums);
        Assertions.assertEquals(expected, result);
    }
}
