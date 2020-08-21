package com.studio3104.leetcode.explore.challenge.August.day21;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    Solution solution = new Solution();

    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(new int[]{3, 1, 2, 4}, new int[]{4, 2, 3, 1})
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void sortArrayByParity(int[] A, int[] expected) {
        int[] result = solution.sortArrayByParity(A);
        Assertions.assertArrayEquals(expected, result);
    }
}
