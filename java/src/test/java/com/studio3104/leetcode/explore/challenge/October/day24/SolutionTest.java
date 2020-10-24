package com.studio3104.leetcode.explore.challenge.October.day24;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    Solution solution = new Solution();

    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(new int[]{100}, 50, 0),
                Arguments.of(new int[]{100, 200}, 150, 1),
                Arguments.of(new int[]{100, 200, 300, 400}, 200, 2),
                Arguments.of(new int[]{26}, 51, 1),
                Arguments.of(new int[]{68, 85, 34, 25, 60}, 44, 2)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void bagOfTokensScore(int[] tokens, int P, int expected) {
        int result = solution.bagOfTokensScore(tokens, P);
        Assertions.assertEquals(expected, result);
    }
}
