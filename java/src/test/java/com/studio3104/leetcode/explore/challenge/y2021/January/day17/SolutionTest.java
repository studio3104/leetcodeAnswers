package com.studio3104.leetcode.explore.challenge.y2021.January.day17;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(1, 5),
                Arguments.of(2, 15),
                Arguments.of(33, 66045)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void minOperations(int n, int expected) {
        Solution solution = new Solution();
        int actual = solution.countVowelStrings(n);
        Assertions.assertEquals(expected, actual);
    }
}
