package com.studio3104.leetcode.explore.challenge.August.day11;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    Solution solution = new Solution();

    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(new int[]{3, 0, 6, 1, 5}, 3),
                Arguments.of(new int[]{0}, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void hIndex(int[] citations, int expected) {
        int result = solution.hIndex(citations);
        Assertions.assertEquals(expected, result);
    }
}
