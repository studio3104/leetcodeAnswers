package com.studio3104.leetcode.explore.challenge.y2020.July.day06;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {
    Solution solution = new Solution();

    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3}, new int[]{1, 2, 4}),
                Arguments.of(new int[]{4, 3, 2, 1}, new int[]{4, 3, 2, 2}),
                Arguments.of(new int[]{9, 9, 9, 9}, new int[]{1, 0, 0, 0, 0})
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void plusOne(int[] digits, int[] expected) {
        int[] result = solution.plusOne(digits);
        assertArrayEquals(expected, result);
    }
}
