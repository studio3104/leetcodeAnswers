package com.studio3104.leetcode.explore.challenge.August.day18;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

class SolutionTest {
    Solution solution = new Solution();

    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(3, 7, new int[]{181, 292, 707, 818, 929}),
                Arguments.of(2, 1, new int[]{10, 12, 21, 23, 32, 34, 43, 45, 54, 56, 65, 67, 76, 78, 87, 89, 98}),
                Arguments.of(3, 1, new int[]{101, 121, 123, 210, 212, 232, 234, 321, 323, 343, 345, 432, 434, 454, 456, 543, 545, 565, 567, 654, 656, 676, 678, 765, 767, 787, 789, 876, 878, 898, 987, 989})
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void numsSameConsecDiff(int N, int K, int[] expected) {
        int[] result = solution.numsSameConsecDiff(N, K);
        Arrays.sort(expected);
        Arrays.sort(result);
        Assertions.assertArrayEquals(expected, result);
    }
}
