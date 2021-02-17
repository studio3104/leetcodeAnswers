package com.studio3104.leetcode.explore.challenge.y2021.February.day17;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}, 49),
                Arguments.of(new int[]{1, 1}, 1),
                Arguments.of(new int[]{4, 3, 2, 1, 4}, 16),
                Arguments.of(new int[]{1, 2, 1}, 2)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void maxArea(int[] height, int expected) {
        Solution solution = new Solution();
        int actual = solution.maxArea(height);
        Assertions.assertEquals(expected, actual);
    }
}
