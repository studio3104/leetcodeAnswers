package com.studio3104.leetcode.explore.challenge.y2021.March.day18;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(new int[]{1, 7, 4, 9, 2, 5}, 6),
                Arguments.of(new int[]{1, 17, 5, 10, 13, 15, 10, 5, 16, 8}, 7),
                Arguments.of(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 2)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void wiggleMaxLength(int[] nums, int expected) {
        Solution solution = new Solution();
        int actual = solution.wiggleMaxLength(nums);
        Assertions.assertEquals(expected, actual);
    }
}
