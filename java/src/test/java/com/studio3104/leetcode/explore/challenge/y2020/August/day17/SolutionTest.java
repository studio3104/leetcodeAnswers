package com.studio3104.leetcode.explore.challenge.y2020.August.day17;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    Solution solution = new Solution();

    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(7, 4, new int[]{1, 2, 3, 1}),
                Arguments.of(10, 3, new int[]{5, 2, 3})
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void distributeCandies(int candies, int num_people, int[] expected) {
        int[] result = solution.distributeCandies(candies, num_people);
        Assertions.assertArrayEquals(expected, result);
    }
}
