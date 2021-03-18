package com.studio3104.leetcode.explore.challenge.y2021.March.day18;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(new int[]{1, 7, 4, 9, 2, 5}, 6),
                Arguments.of(new int[]{1, 17, 5, 10, 13, 15, 10, 5, 16, 8}, 7),
                Arguments.of(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 2),
                Arguments.of(new int[]{33, 53, 12, 64, 50, 41, 45, 21, 97, 35, 47, 92, 39, 0, 93, 55, 40, 46, 69, 42, 6, 95, 51, 68, 72, 9, 32, 84, 34, 64, 6, 2, 26, 98, 3, 43, 30, 60, 3, 68, 82, 9, 97, 19, 27, 98, 99, 4, 30, 96, 37, 9, 78, 43, 64, 4, 65, 30, 84, 90, 87, 64, 18, 50, 60, 1, 40, 32, 48, 50, 76, 100, 57, 29, 63, 53, 46, 57, 93, 98, 42, 80, 82, 9, 41, 55, 69, 84, 82, 79, 30, 79, 18, 97, 67, 23, 52, 38, 74, 15}, 67)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void wiggleMaxLength(int[] nums, int expected) {
        Solution solution = new Solution();
        int actual = solution.wiggleMaxLength(nums);
        Assertions.assertEquals(expected, actual);
    }
}
