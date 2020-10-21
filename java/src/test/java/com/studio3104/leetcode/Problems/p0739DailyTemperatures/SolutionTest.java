package com.studio3104.leetcode.Problems.p0739DailyTemperatures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    Solution solution = new Solution();

    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(new int[]{73, 74, 75, 71, 69, 72, 76, 73}, new int[]{1, 1, 4, 2, 1, 1, 0, 0})
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void dailyTemperatures(int[] T, int[] expected) {
        int[] result = solution.dailyTemperatures(T);
        Assertions.assertArrayEquals(expected, result);
    }
}
