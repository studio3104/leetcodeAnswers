package com.studio3104.leetcode.TopInterview150.ArrayString.p0080RemoveDuplicatesFromSortedArrayII;

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
    void removeElement(int[] nums, int expected, int[] expectedNums) {
        int result = solution.removeDuplicates(nums);
        Assertions.assertEquals(expected, result);

        for (int i = 0; i < expectedNums.length; ++i) {
            Assertions.assertEquals(expectedNums[i], nums[i]);
        }
    }
}