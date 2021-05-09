package com.studio3104.leetcode.explore.challenge.y2021.May.day09;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(new int[]{9, 3, 5}, true),
                Arguments.of(new int[]{1, 1, 1, 2}, false),
                Arguments.of(new int[]{8, 5}, true),
                Arguments.of(new int[]{1, 1000000000}, true),
                Arguments.of(new int[]{2}, false)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void isPossible(int[] target, boolean expected) {
        Solution solution = new Solution();
        boolean actual = solution.isPossible(target);
        Assertions.assertEquals(expected, actual);
    }
}
