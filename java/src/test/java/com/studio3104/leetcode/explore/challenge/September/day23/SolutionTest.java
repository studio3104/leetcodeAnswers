package com.studio3104.leetcode.explore.challenge.September.day23;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    Solution solution = new Solution();

    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 4, 5}, new int[]{3, 4, 5, 1, 2}, 3),
                Arguments.of(new int[]{2, 3, 4}, new int[]{3, 4, 3}, -1),
                Arguments.of(new int[]{5, 1, 2, 3, 4}, new int[]{4, 4, 1, 5, 1}, 4)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void canCompleteCircuit(int[] gas, int[] cost, int expected) {
        int result = solution.canCompleteCircuit(gas, cost);
        Assertions.assertEquals(expected, result);
    }
}
