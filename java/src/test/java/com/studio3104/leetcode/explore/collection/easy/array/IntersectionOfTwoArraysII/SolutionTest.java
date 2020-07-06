package com.studio3104.leetcode.explore.collection.easy.array.IntersectionOfTwoArraysII;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {
    Solution solution = new Solution();

    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(
                        new int[]{1, 2, 2, 1}, new int[]{2, 2},
                        new int[]{2, 2}
                ),
                Arguments.of(
                        new int[]{4, 9, 5}, new int[]{9, 4, 9, 8, 4},
                        new int[]{4, 9}
                )
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void intersect(int[] nums1, int[] nums2, int[] expected) {
        int[] result = solution.intersect(nums1, nums2);
        Arrays.sort(result); Arrays.sort(expected);
        assertArrayEquals(expected, result);
    }
}
