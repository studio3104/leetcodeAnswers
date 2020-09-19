package com.studio3104.leetcode.explore.challenge.September.day19;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

class SolutionTest {
    Solution solution = new Solution();

    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(100, 300, List.of(123, 234)),
                Arguments.of(1000, 13000, List.of(1234, 2345, 3456, 4567, 5678, 6789, 12345))
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void sequentialDigits(int low, int high, List<Integer> expected) {
        List<Integer> result = solution.sequentialDigits(low, high);
        Assertions.assertEquals(expected, result);
    }
}
