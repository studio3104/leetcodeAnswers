package com.studio3104.leetcode.explore.challenge.y2020.September.day26;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    Solution solution = new Solution();

    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(new int[]{1, 4}, 2, 4),
                Arguments.of(new int[]{1, 2}, 2, 3)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void findPoisonedDuration(int[] timeSeries, int duration, int expected) {
        int result = solution.findPoisonedDuration(timeSeries, duration);
        Assertions.assertEquals(expected, result);
    }
}
