package com.studio3104.leetcode.explore.challenge.y2021.February.day25;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(new int[]{2, 6, 4, 8, 10, 9, 15}, 5),
                Arguments.of(new int[]{1, 2, 3, 4}, 0),
                Arguments.of(new int[]{1}, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void findUnsortedSubarray(int[] nums, int expected) {
        Solution solution = new Solution();
        int actual = solution.findUnsortedSubarray(nums);
        Assertions.assertEquals(expected, actual);
    }
}
