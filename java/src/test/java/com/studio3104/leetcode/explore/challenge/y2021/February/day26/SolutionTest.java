package com.studio3104.leetcode.explore.challenge.y2021.February.day26;

 import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 4, 5}, new int[]{4, 5, 3, 2, 1}, true),
                Arguments.of(new int[]{1, 2, 3, 4, 5}, new int[]{4, 3, 5, 1, 2}, false)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void validateStackSequences(int[] pushed, int[] popped, boolean expected) {
        Solution solution = new Solution();
        boolean actual = solution.validateStackSequences(pushed, popped);
        Assertions.assertEquals(expected, actual);
    }
}
