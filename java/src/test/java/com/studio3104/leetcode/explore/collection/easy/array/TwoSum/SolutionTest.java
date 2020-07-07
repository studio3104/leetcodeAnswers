package com.studio3104.leetcode.explore.collection.easy.array.TwoSum;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {
    Solution solution = new Solution();

    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(
                        new int[]{2, 7, 11, 15}, 9,
                        new int[]{0, 1}
                ),
                Arguments.of(
                        new int[]{3, 2, 4}, 6,
                        new int[]{1, 2}
                )
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void twoSum(int[] nums, int target, int[] expected) {
        int[] result = solution.twoSum(nums, target);
        assertArrayEquals(expected, result);
    }
}