package com.studio3104.leetcode.TopInterview150.ArrayString.p0167TwoSumIIInputArrayIsSorted;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    Solution solution = new Solution();

    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(new int[]{2, 7, 11, 15}, 9, new int[]{1, 2}),
                Arguments.of(new int[]{2, 3, 4}, 6, new int[]{1, 3}),
                Arguments.of(new int[]{-1, 0}, -1, new int[]{1, 2})
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void removeElement(int[] numbers, int target, int[] expected) {
        int[] result = solution.twoSum(numbers, target);
        Assertions.assertArrayEquals(expected, result);
    }
}
