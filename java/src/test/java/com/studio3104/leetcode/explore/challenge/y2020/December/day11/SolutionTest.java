package com.studio3104.leetcode.explore.challenge.y2020.December.day11;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    Solution solution = new Solution();

    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(new int[]{1, 1, 1, 2, 2, 3}, 5, new int[]{1, 1, 2, 2, 3}),
                Arguments.of(new int[]{0, 0, 1, 1, 1, 1, 2, 3, 3}, 7, new int[]{0, 0, 1, 1, 2, 3, 3})
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void removeDuplicates(int[] nums, int expectedLength, int[] expectedNums) {
        int actualLength = solution.removeDuplicates(nums);
        Assertions.assertEquals(expectedLength, actualLength);

        for (int i = 0; i < actualLength; ++i) {
            Assertions.assertEquals(expectedNums[i], nums[i]);
        }
    }
}
